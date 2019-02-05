package Methods;

import java.util.Scanner;

public class Methods3 {
	 public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     System.out.print("enter number");
	     int num = inp.nextInt();
	     mymethod(num);
	     inp.close();
	  
	  }
	  public static void mymethod(int n){
	    System.out.println((n+1)+" "+(n+2)+" "+(n+3));
	  }
}
