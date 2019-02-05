package Methods_With_StringBuilder;

import java.util.*;

public class Class5 {
	 public  StringBuilder replaceWith(String[] r,String replace,String replaceWith) 
	  {
	  String rr=Arrays.toString(r);
	  rr=rr.replace(replace,replaceWith).replace("[","").replace("]","")
	  .replace(",","").replace(" ","");
	  StringBuilder myB=new StringBuilder(rr);
	   return myB;
	  }
	  
	  public static void main(String[] args)
	  {
		  Class5 m = new Class5();
	    String[] r= new String[]{"a","b","a","b"};
	    StringBuilder tst = m.replaceWith(r,"b","a");
	    System.out.print(tst);

	   
	    
	  }//end main
}
