package Methods;

import java.util.Scanner;

public class Methods6 {
	 public static void sign(int A)
	  {
	    //your code here
	    int number=0;
	    if(A>0)number=1;
	    else if(A<0)number=-1;
	    else number=0;
	    System.out.println(number);
	    
	  }//end sign
	  
	  public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     int n = inp.nextInt();
	    
	    sign(n);
	    inp.close();
	  }	
	
}
