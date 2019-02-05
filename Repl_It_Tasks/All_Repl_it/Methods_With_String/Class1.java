package Methods_With_String;

import java.util.Scanner;

public class Class1 {
	static Scanner scan=new Scanner(System.in);
	  static public void main(String[] str){
	    String AA=scan.nextLine(),BB=scan.nextLine();
	    System.out.println(mergeStrings(AA,BB));
	    
	  }
	  public static String mergeStrings(String one, String two) {
			StringBuilder DD=new StringBuilder();
			int length=Math.max(one.length(), two.length());
		    for(int i=0; i<length; i++){
		    	if (i < one.length()) {
		            DD.append(one.charAt(i));
		        }
		        if (i < two.length()) {
		            DD.append(two.charAt(i));
		    }
		  }
		    String CC=DD.toString();
		    return CC;
		}
}
