package Methods_With_String;

import java.util.Scanner;

public class Class8 {
	 static  public void main(String[] args){
		    Scanner scan=new Scanner(System.in);
		    String a=scan.next(), b=scan.next();
		    System.out.println(biggerS(a,b));
		    scan.close();
		  }
		  
		  public static String biggerS(String a ,String b)
		  {
		   String str=(a.length()>b.length())?a:b;
		   return str;
		  }
}
