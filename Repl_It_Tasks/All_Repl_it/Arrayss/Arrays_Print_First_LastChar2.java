package Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Print_First_LastChar2 {
	 public static void main(String[] args) {
		    
		    Scanner input = new Scanner(System.in);
		    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		   

		    //TODO: Write your code below
		    int z=0;
		    for(String each: words){
		      words[z]=each.substring(0,1)+each.substring(each.length()-1);
		      z++;
		    }
		    System.out.println(Arrays.toString(words));
		    input.close();
		  }
}
