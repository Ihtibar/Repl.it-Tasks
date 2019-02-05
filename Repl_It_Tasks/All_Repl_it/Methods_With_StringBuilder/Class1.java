package Methods_With_StringBuilder;

import java.util.Arrays;

public class Class1 {
	 public static StringBuilder  arrayToSb(String[] r) 
	  {
	    String z=Arrays.toString(r);
	    z=z.replace(",","").replace("[","").replace("]","").replace(" ","");
	    StringBuilder B=new StringBuilder(z);
	  return B;
	   
	  }
	  
	  public static void main(String[] args)
	  {
	    
	    String[]  arr = new String[]{"a","1","2"};
	    

	    StringBuilder recipt = arrayToSb(arr);
	    System.out.print(recipt.toString());

	   
	    
	  }//end main
}
