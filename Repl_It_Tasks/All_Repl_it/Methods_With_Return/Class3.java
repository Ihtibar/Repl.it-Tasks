package Methods_With_Return;

import java.util.Scanner;

public class Class3 {
	 static Scanner scan=new Scanner(System.in);
	  static public void main(String[] str){
	    int num=scan.nextInt();
	    System.out.println(isEven(num));
	  }
	  
	  public static boolean isEven(int n)
	  {
	    boolean AA=false;
	   if(n%2==0) AA=true;
	   return AA;
	  }
}
