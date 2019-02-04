package Arrayss;

import java.util.Scanner;

public class Arrays_CountEvents {
	
	 public static void main(String[] args) {
		    
		    Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: Write your code below
		    int count=0;
		    for(int i:nums){
		      if(i%2==0)count+=1;
		    }
		    System.out.println(count);
		    input.close();
		  }

}
