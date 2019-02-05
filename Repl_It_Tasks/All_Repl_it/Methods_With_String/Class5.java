package Methods_With_String;

import java.util.Scanner;

public class Class5 {
	static public void main(String[] str){
	    Scanner scan=new Scanner(System.in);
	    String one=scan.next(), two=scan.next();
	    System.out.println(clean(one, two).trim());
	    scan.close();
	  }
	  public static String clean (String text ,String badWord) {
	  String newstr="";
		  while(text.contains(badWord)){
		    text=text.replaceFirst(badWord,"");
		  }
		   while(badWord.contains(text)){
		    badWord=badWord.replaceFirst(text,"");
		  }
		   if(text.length()>badWord.length()) newstr=text;
		   else newstr=badWord;
		      return newstr; 
	  }
}
