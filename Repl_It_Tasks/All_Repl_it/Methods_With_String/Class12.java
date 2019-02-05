package Methods_With_String;

import java.util.Scanner;

public class Class12 {
	static public void main(String[] args){
	    Scanner scan=new Scanner(System.in);
	    String s=scan.next();
	    System.out.println(extractNum(s));
	    scan.close();
	  }
	  
	  public static String extractNum(String s) {
	     String result="";
			    for(int i=0; i<s.length();i++){
			      char AA=s.charAt(i);
			      if( Character.isDigit(AA)) result+=AA;
			    }
			   return result;
	  }
}
