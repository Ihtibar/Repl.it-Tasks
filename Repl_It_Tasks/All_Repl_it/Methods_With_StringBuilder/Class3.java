package Methods_With_StringBuilder;

import java.util.*;

public class Class3 {
	 public StringBuilder trim_posts(String[] r,int size) 
	  {
	        ArrayList<String> mylist=new ArrayList<>(Arrays.asList(r));
		        ArrayList<String> mylist2=new ArrayList<>();
		        for(int i=0; i<mylist.size(); i++) {
		        	mylist.set(i, mylist.get(i)+"<br>");
		        }
		        for(int z=0; z<mylist.size(); z++) {
		        	if(mylist.get(z).length()>=(size+4)) 
		        			mylist2.add(mylist.get(z));
		        }
		        mylist.removeAll(mylist2);
		        r=mylist.toArray(new String[mylist.size()]);
		     String  AA=Arrays.toString(r).replace(", ", "").replace("[", "").replace("]", "");
		        StringBuilder myB=new StringBuilder(AA);
		       
			          return myB;
	  }
	  public static void main(String[] args)
	  {
		  Class3 m = new Class3();
	    
	    String[]  arr = new String[]{"abcde","12345678","a very long post"};
	    
	    StringBuilder tst = m.trim_posts(arr,9);
	    System.out.print(tst);

	   
	    
	  }//end main
}
