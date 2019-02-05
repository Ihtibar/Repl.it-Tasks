package Methods_With_String;

import java.util.Scanner;

public class Class14 {
	  static public void main(String[] args){
		    Scanner scan=new Scanner(System.in);
		    String newstr=scan.next();
		    System.out.println(isPalindrome(newstr));
		    scan.close();
		  }
		  
		  public static boolean isPalindrome(String check) {
		    boolean result=false;
		    StringBuilder mybuilder=new StringBuilder(check);
		    check=check.replace(" ","");
		    String str=mybuilder.reverse().toString().replace(" ","");
		    if(str.equalsIgnoreCase(check)) result=true;
		    else result=false;
		    return result;
		  }
}
