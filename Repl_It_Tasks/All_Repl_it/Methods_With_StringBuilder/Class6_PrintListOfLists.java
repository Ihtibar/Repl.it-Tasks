package Methods_With_StringBuilder;

import java.util.*;

public class Class6_PrintListOfLists {
	public String printList(ArrayList<ArrayList<String>> nestedList) 
	  {
	    String AA="";
		    for(int i=0; i<nestedList.size(); i++) {
		    	for(int z=0; z<nestedList.get(i).size(); z++) {
		    		AA+=nestedList.get(i).get(z);
		    	}
		    }
		   return AA;
	  }
	  public static void main(String[] args)
	  {
		  Class6_PrintListOfLists m = new Class6_PrintListOfLists();
	    ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
	    arr.add(new ArrayList<String>());
	    arr.add(new ArrayList<String>());
	    String[] strs = new String[]{"a","a","b"};
	    Collections.addAll(arr.get(0),strs);
	    
	    strs = new String[]{"z","z","z"};
	    Collections.addAll(arr.get(1),strs);
	    
	    
	    System.out.print(m.printList(arr));
	   
	    
	  }//end main
}
