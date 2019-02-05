package Methods_With_String;

import java.util.Scanner;

public class Class3 {
	 public static void main(String[] args) {
		    Scanner scan=new Scanner(System.in);
		    String a=scan.next(), b=scan.next();
		    System.out.println(coverString(a,b));
		    scan.close();
		  }
		  
		  public static String coverString(String main, String coverME) {
		     String newstr="["+coverME+"]";
				 
					    if(main.contains(coverME)) main=main.replaceAll(coverME,newstr);
					    else main="["+main+"]";

				    return main;
		  }
}
