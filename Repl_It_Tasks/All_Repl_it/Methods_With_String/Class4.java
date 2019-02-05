package Methods_With_String;

import java.util.Scanner;

public class Class4 {
	 static public void main(String[] args){
		    Scanner scan=new Scanner(System.in);
		    String input=scan.next();
		    System.out.println(wordCount(input));
		    scan.close();
		  }
		  
		  public static int wordCount(String words) {
		    String[] str=words.split(" ");
		    int num=str.length;
		    return num;
		    
		  }
}
