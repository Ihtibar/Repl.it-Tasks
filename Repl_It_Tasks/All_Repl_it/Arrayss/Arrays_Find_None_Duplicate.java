package Arrayss;

import java.util.Scanner;

public class Arrays_Find_None_Duplicate {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: write your code below
	    boolean AA=true;
			for(int i=0; i<nums.length;i++) {
				AA=false;
				for(int z=0;z<nums.length;z++) {
					if(i==z) continue;
					if(nums[i]==nums[z])  AA=true;
				}
				if(AA==false)  System.out.println(nums[i]);
			}
					input.close();
	  }
}
