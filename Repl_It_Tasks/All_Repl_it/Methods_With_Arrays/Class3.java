package Methods_With_Arrays;

import java.util.Scanner;

public class Class3 {
	public static int[] mergR(int[] a,int[] b) {
	    int[] ab=new int[(a.length + b.length)];
	    for(int i=0; i<a.length; i++){
	      ab[i]=a[i];
	    }
	    int c=a.length;
	    for(int z=0; z<b.length; z++){
	      ab[c]=b[z];
	      c++;
	    }
	   return ab;
	  }//end mergR
	  
	  public static void main(String[] args) 
	  {
	    Scanner scan=new Scanner(System.in);
	    int size1=scan.nextInt(), size2=scan.nextInt();
	    int[] a=new int[size1];
	    for(int i=0; i<size1; i++){
	      a[i]=scan.nextInt();
	    }
	    for(int z=0; z<size2; z++){
	      a[z]=scan.nextInt();
	    }
	   scan.close();
	   
	  }
}
