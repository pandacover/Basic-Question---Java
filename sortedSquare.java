import java.util.*;
public class sortedSquare {
    static Scanner sc = new Scanner(System.in);
    static int[] Solution(int[] A) {
        int soln[] =  new int [A.length];
        for (int i = 0, j = A.length-1, k = A.length-1; k >= 0;) {
            if(Math.abs(A[i]) > Math.abs(A[j])) {
                soln[k] = Math.abs(A[i]);
                i++;
            }
            else {
                soln[k] = Math.abs(A[j]);
                j--;
            }
            k--;
        }

        for (int i = 0; i < A.length; i++) {
            soln[i] = soln[i]*soln[i];
        }
        return soln;
    }

    

    public static void main(String[] args) {
        int a[] = new int[5];
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        a = Solution(a);
        for(int i = 0; i < a.length; i++)
        System.out.println(a[i]);
    }
}
