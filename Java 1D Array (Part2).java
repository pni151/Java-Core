import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        //call the function passing the leap, array, index
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int m, int[] arr, int i) {
        //Base conditions
        //if index is less than 0 or value 1 return false
        if (i < 0 || arr[i] == 1) return false;
        //return true only when greater than or equal to length
        if ((i >= arr.length - 1) || i + m > arr.length - 1) return true;

        arr[i] = 1; //reassign 1 to avoid infinte recursion
        //call function for all 3 conditions i+1, i-1, i+m indexes
        return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
