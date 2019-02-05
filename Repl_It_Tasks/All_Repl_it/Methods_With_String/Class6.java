package Methods_With_String;

import java.util.Scanner;

public class Class6 {
	 static public void main(String[] args){
		    Scanner scan=new Scanner(System.in);
		    String input1=scan.next();
		    int input2=scan.nextInt();
		    System.out.println(limit(input1,input2));
		    scan.close();
		  }
		  
		  public static String limit(String text, int maxLength)
		  {
		    String str=text.substring(0,maxLength);
		    return str;
		  }
}
