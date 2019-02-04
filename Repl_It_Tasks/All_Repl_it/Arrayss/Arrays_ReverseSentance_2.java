package Arrayss;

import java.util.Scanner;

public class Arrays_ReverseSentance_2 {
	
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    //TODO: start your code here
	     String[] str=sentence.split(" ");
				    String[] newstr=new String[str.length];
				    
				    int z=0;
				    for(int i=str.length-1;i>=0;i--){
				     newstr[z]=str[i];
				     ++z;
				    }
				    for(int x=0;x<str.length;x++) {
				      if(x<str.length-1){
				    	reversed=reversed+newstr[x]+" ";
				      }
				    	if(x==str.length-1){
				    	  reversed=reversed+newstr[x];
				    	  break;
				    	}
				    }
	    //End your code here. do not modify below statement
	    System.out.println(reversed);
	    		input.close();
	  }
}