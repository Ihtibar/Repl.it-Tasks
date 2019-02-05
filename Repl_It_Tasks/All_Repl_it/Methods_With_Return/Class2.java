package Methods_With_Return;

import java.util.Scanner;

public class Class2 {
	 static Scanner scan=new Scanner(System.in);
	  static public void main(String[] str){
	    int num1=scan.nextInt(), num2=scan.nextInt();
	    System.out.println(max(num1,num2));
	  }
	  
	  public static int max(int x,int  max)
	  {
	    int min=Math.min(x,max);
	    return min;
	  }
}
