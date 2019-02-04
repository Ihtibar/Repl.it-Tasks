package Arrayss;

import java.util.*;

public class Arrays_ReverseArray {
	 public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: write your code below
		    int[] nums2=new int[nums.length];
		    int z=nums.length-1;
		    for (int i =0; i<nums.length;i++){
		      nums2[i]=nums[z];
		      z--;
		      if(z<0) break;
		      
		    }
		    //Do not change below statement:
		    System.out.println(Arrays.toString(nums2));
		    	input.close();
	 }

}
