package MEthods_With_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Class10 {
	public static void main(String[] args)
	{
	  ArrayList<Integer> mynum=new ArrayList<>(Arrays.asList(1,2,3,4,5));
	  timesTwo(mynum);
		
	}
	//create your method below
	static void timesTwo(ArrayList<Integer> nums){
	  for(int i=0; i< nums.size(); i++){
	    nums.set(i, nums.get(i)*2);
	  }
	  System.out.println(nums);
	}
}
