package Arrayss;

	/*
	 *
	 * 
	 */

import java.util.*;

public class Arrays_Printing01 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}
		//leave above alone!  write your code below
		
		  for(String str:arr){
		      System.out.println(str.substring(0, 3));
		    }
		  input.close();
	}

}
