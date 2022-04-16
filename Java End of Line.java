import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count = 0; //to keep count of lines input
        //hasNext This method returns true if and only if this scanner has another token.
        while(sc.hasNext()){
            count +=1;
            System.out.println( count + " " + sc.nextLine());
        }
    }
}
