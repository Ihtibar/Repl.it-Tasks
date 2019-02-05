package Methods;

import java.util.Scanner;

public class Methods5 {
			
	 public static void cube() {
	    //your code here
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    int cube=(n*n*n);
	    System.out.println("cube of "+n+" = "+cube);
	    scan.close();
	  }//end cube
	  
	  public static void main(String[] args) {
	    cube();
	   
	  }
}
