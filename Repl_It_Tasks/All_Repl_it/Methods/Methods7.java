package Methods;

import java.util.Scanner;

public class Methods7 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	        arr[i]=inp.nextInt();
	    
	    plus_minus(arr);
	    inp.close();
	  }//end main
	  public static void plus_minus(int[] AA){
	    int countzero=0, countpositive=0, countnegative=0;
	    
	    for(int z=0;z<AA.length;z++){
	      if(AA[z]==0) countzero+=1;
	      if(AA[z]>0) countpositive+=1;
	      if(AA[z]<0) countnegative+=1;
	    }
	    System.out.println("positives:"+countpositive+", negatives:"
	                      +countnegative+", zeros:"+countzero);
	    
	  }
	  

}
