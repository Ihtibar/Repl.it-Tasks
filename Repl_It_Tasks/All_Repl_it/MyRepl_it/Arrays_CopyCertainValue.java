package MyRepl_it;
import java.util.Arrays;

		/*
		 * Given a String array arr with the following elements
		["zero", "one", "two","three","four"]	
		Create another array fewValues and copy words that have letter "e" in them
		You need to know how many element contain "e" and create array accordingly
		Values in fewValues array need to be["zero", "one","three"]
		Examples:
		arr -> ["aa", "be", "lol", "lel", "oreo"] 
		fewValues -> ["be",  "lel", "oreo"] 
		arr -> ["e", "hey", "bye", "furey", "spoon"] 
		fewValues ->["e", "hey", "bye", "furey"] 
		 */

public class Arrays_CopyCertainValue {
	
	 public static void main(String[] args) {
		   
		  }
	  
		  public static String[] getWithE(String[] arr) {
		    
		    //TODO : YOUR CODE GOES HERE ----------------------
		    int count = 0;
				for(int i=0;i<arr.length;i++) 
					if(arr[i].contains("e")) 	count++;	
				
					String[] fewValues=new String[count];
					int y=0;
					for(String each:arr) 
						if(each.contains("e")) {
							fewValues[y]=each;
							y++;
						}
		    //YOUR CODE ENDS HERE -----------------------
		    return fewValues;
		  }
		  

}
