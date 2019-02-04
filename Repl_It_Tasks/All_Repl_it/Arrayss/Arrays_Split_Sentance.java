package Arrayss;

import java.util.*;

public class Arrays_Split_Sentance {
	
	 public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		 String[] myarrays=sentence.split(" ");
		 for(String each: myarrays){
		   System.out.println(each);
		 }
		 input.close();
		  }

}