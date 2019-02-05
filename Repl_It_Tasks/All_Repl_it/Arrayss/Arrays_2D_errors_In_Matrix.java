package Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_2D_errors_In_Matrix {
	 public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    int rows = inp.nextInt(), cols = inp.nextInt();
		    String[][] arr = new String[rows][cols];
		    for(int i=0 ;i<=rows-1;i++)
		    {
		      for(int j=0 ;j<=cols-1;j++)
		      {
		        arr[i][j]=inp.next();
		      }//end for cols
		    }//end for rwos
		    
		    
		    //your code here
		    for(int i=0;i<arr.length;i++){
		      for(int j=0; j<arr[i].length;j++){
		        if(j%2==0)arr[i][j]="0";
		        else arr[i][j]="1";
		      }
		    }
		  
		    System.out.println( Arrays.deepToString(arr) ) ;
		    inp.close();
		  }//end main

}
