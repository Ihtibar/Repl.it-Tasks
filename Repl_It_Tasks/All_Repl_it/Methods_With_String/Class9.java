package Methods_With_String;

import java.util.Scanner;

public class Class9 {
	 static public void main(String[] args){
		    Scanner scan=new Scanner(System.in);
		    String input=scan.next();
		   System.out.println(removeFirst(input));
		   scan.close();
		  }
		  
		  public static String removeFirst(String target) {
		    return target.substring(1);
		    
		  }
}	
