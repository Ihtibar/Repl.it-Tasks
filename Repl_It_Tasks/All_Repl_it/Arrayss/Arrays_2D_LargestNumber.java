package Arrayss;

import java.util.*;

public class Arrays_2D_LargestNumber {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rows
	    
	    
	    //TODO write your code below
	    int max=-99999;
	    for(int z=0;z<arr.length;z++){
	      Arrays.sort(arr[z]);
	      if(arr[z][cols-1]>max) max= arr[z][cols-1];
	    }
	    System.out.println(max);

	    inp.close();
	   
	  }//end main
}