package Arrayss;

import java.util.Scanner;

public class Arrays_Print_First_LastChar {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    String[] word = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   
	   for(String words: word){
	     System.out.println(words.charAt(0)+""+words.charAt(words.length()-1));
	   }
	   		input.close();
	    
	  }
}
