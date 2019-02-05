package MEthods_With_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Class18 {
	public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) 
	  {
	   Collection<Integer> removethose=Arrays.asList(n);
	   r.removeAll(removethose);
	   
	   return r;
	  }
	  
	  public static void main(String[] args)
	  {
	  
	    ArrayList<Integer>  arr = new ArrayList<>();
	    Integer[] nums = new Integer[]{1,1,2,3};
	    arr.addAll(Arrays.asList(nums));
	    
	    System.out.print(removeInst(arr,1));
	   
	    
	  }//end main
}
