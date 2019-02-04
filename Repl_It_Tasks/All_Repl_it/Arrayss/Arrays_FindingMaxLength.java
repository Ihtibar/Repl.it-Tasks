package Arrayss;

		
	

import java.util.*;
public class Arrays_FindingMaxLength {
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++)  
		  words[i] = input.nextLine();		  		
		
		//write your code below
		Arrays.sort(words);
	String smallest="";
	for(String each: words)
	  if(each.length() > smallest.length())
		  		smallest=each;
	
	System.out.println(smallest);
		input.close();
	}
}