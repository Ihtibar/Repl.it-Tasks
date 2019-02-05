package MEthods_With_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Class15 {
	 public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2) 
	  {
	   String[] r=list.toArray(new String[list.size()]);
	   ArrayList<String> mylist=new ArrayList<>(Arrays.asList(r));
	   mylist.set(pos1, r[pos2]);
	   mylist.set(pos2, r[pos1]);
	   
	    return mylist;
	  }
	  
	  public static void main(String[] args)
	  {
	   ArrayList<String> AA=new ArrayList<>(Arrays.asList("one","two","three"));
	   int A=0;
	   int B=2;
	   
	   System.out.println(swap(AA,A,B));
	   
	  }//end main
}
