package Methods_With_2DArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Methods_withArrays9_IsSorted {
	 static public void main(String[] args){
		    Scanner scan=new Scanner(System.in);
		    int size=scan.nextInt();
		    int[] nums=new int[size];
		    for(int i=0; i<size; i++){
		      nums[i]=scan.nextInt();
		    }
		    System.out.println(isSort(nums));
		    scan.close();
		  }
		  
		  
		  public static boolean isSort(int[] nums) 
		  {
		    String num1=Arrays.toString(nums).replace(",","").replace("[","").replace("]","");
				  boolean A=false;
				    int[] AA=new int[nums.length];
				    AA=nums;
				    Arrays.sort(AA);
				    
				    String num2=Arrays.toString(AA).replace(",","").replace("[","").replace("]","");
				    num1=num1.replaceAll(" ","");
				    num2=num2.replaceAll(" ","");
				    System.out.println(num1+"\n"+num2);
				    if(num1.equals(num2)) A=true;
				    
				   return A;
		  }
}
