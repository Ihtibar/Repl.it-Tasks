package Methods_With_String;

import java.util.Scanner;

public class Class11 {
	static public void main(String[] args){
	    Scanner scan=new Scanner(System.in);
	    String AA=scan.next();
	    System.out.println(reverse(AA));
	    scan.close();
	  }
		public static String reverse(String input)
		{
		   StringBuilder mystr=new StringBuilder(input);
		   String result=mystr.reverse().toString();
		   return result;
		}
}
