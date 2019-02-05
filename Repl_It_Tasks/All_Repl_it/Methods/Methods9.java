package Methods;

import java.util.Scanner;

public class Methods9 {
		
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    //#2 Your code here
	    isPos(arr);
	    	inp.close();
	  }
	  
	  public static void isPos(int[] num) {
	    //#1 your code here
	    
	   for(int z=0;z<num.length;z++){
	     if(num[z]>0) System.out.println("positive");
	     else System.out.println("not positive");
	      }
	  }
}
