package Arrayss;

import java.util.Arrays;

public class Arrays_2D_MultiplicationTable {
	public static void main(String[] args) {
	    int [][] multiplicationTable = new int[10][10];
	    
	    //TODO: type your code below
	    for(int i=1;i<=10;i++){
	      for(int z=1;z<=10;z++){
	        multiplicationTable[i-1][z-1]=i*z;
	      }
	    }
	    //Do not modify below line it will be used to test your code. And 
	    //Can be used by you while developing your code
	    System.out.println(Arrays.deepToString(multiplicationTable) ) ;
	  }
}
