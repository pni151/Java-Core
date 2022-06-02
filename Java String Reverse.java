import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //Checks whether the reverse is equal to original ignoring the case
         if(A.equalsIgnoreCase(new StringBuffer(A).reverse().toString()))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}



