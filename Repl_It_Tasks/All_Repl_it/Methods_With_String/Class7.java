package Methods_With_String;

import java.util.Scanner;

public class Class7 {
	static public void main(String[] args){
	    Scanner scan=new Scanner(System.in);
	    String input1=scan.next(), input2=scan.next();
	    System.out.println(at3(input1,input2));
	    scan.close();
	  }
	  
	  public static String at3(String target,String word)
	  {
	  String newstr=target.substring(0,3)+word+target.substring(3);
	  return newstr;
	    
	  }
}
