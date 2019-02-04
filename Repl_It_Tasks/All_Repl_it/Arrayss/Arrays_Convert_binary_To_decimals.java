package Arrayss;

import java.util.Scanner;

public class Arrays_Convert_binary_To_decimals {
	 public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    
		    int[] binary = new int[8];
		    for(int i =0; i < binary.length; i++) {
		      binary[i] = input.nextInt();
		    }
		    
		    //TODO: Write your code below.
		    int total=0;
		    if(binary[0]==1)total+=128;
		    else total+=0;
		    if(binary[1]==1)total+=64;
		    else total+=0;
		    if(binary[2]==1)total+=32;
		    else total+=0;
		    if(binary[3]==1)total+=16;
		    else total+=0;
		    if(binary[4]==1)total+=8;
		    else total+=0;
		    if(binary[5]==1)total+=4;
		    else total+=0;
		    if(binary[6]==1)total+=2;
		    else total+=0;
		    if(binary[7]==1)total+=1;
		    else total+=0;
		    System.out.println(total);
		    input.close();
		  }

}
