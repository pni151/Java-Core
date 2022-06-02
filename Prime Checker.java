import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in; //to avoid error for buffered reader

class Prime{
    public void checkPrime(int... arr){// as we are asked not to overload
        //run loop till arrays length
        //take each element at a time
        for(int i=0;i<arr.length;i++){
            //if the no is less than 2 surely not prime so do nothing
            if(arr[i]<2){
                
            }
            //if it equal to 2 then print the number. with space
            else if(arr[i]==2){
                System.out.print(arr[i]+" ");//2
            }
            //now here we check for no greater than 2
            else{
                //logic acts like flag
                int logic = 1;
                //start the loop from 2 till the arr[i]ie value of the element
                //note = is not used so we are checking till value-1
                for(int j=2;j<arr[i];j++){
                    //if divisble then set logic to 0 and break loop
                    if(arr[i]%j==0){
                        logic = 0;
                        break;
                    }
                }
                //print only if logic is 1
                if(logic==1){
                    System.out.print(arr[i]+" ");
                }
            }
        }
        System.out.println();//print in new line
    }
}
public class Solution {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

