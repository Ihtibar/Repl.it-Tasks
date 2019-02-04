package Arrayss;

import java.util.*;
public class Arrays_Has55 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO Type your code below:
	    boolean f = false;
	  for(int i = 0; i < nums.length; i++)
	    if(nums[i]==5)
	      if(i < nums.length-1)
	        if(nums[i+1]==5)
	          f = true;
	  
	  System.out.println(f);
	  input.close();
	  }

}
