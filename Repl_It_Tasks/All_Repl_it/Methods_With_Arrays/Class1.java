package Methods_With_Arrays;

import java.util.Scanner;

public class Class1 {
	 static public void main(String[] args){
		    Scanner scan=new Scanner(System.in);
		    int A=scan.nextInt();
		    int[] BB=new int[A];
		    int[] CC=new int[A];
		    
		    for(int i=0; i<A; i++){
		      BB[i]=scan.nextInt();
		    }
		    for(int z=0; z<A; z++){
		       CC[z]=scan.nextInt();
		    }
		    scan.close();
		  }
		  
		  public static int[] addElements(int[] ints1, int[] ints2) {
		    for (int i=0; i<ints1.length; i++){
		      ints2[i]=ints1[i]+ints2[i];
		    }
		    return ints2;
		  }
}
