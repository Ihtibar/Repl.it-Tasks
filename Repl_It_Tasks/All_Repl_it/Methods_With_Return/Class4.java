package Methods_With_Return;

import java.util.Scanner;

public class Class4 {
	 static Scanner scan=new Scanner(System.in);
	  
	  static public void main(String[] str){
	    int num1=scan.nextInt(), num2=scan.nextInt();
	    System.out.println(c_profits(num1,num2));
	  }
	  static String c_profits (int buyPrice,int sellPrice)
	  {
	    //your code here
	   String result=(sellPrice>buyPrice)?"profit":(sellPrice<buyPrice)?"loss":"no loss";
	   return result;
	  }

}
