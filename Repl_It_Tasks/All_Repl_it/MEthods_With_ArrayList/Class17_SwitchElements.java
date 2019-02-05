package MEthods_With_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Class17_SwitchElements {
	static public void main(String[] args){
	    int[] zz={1,2,3,4};
	    System.out.println(Arrays.toString(do_switch(zz)));
	  }
	  
	public static int[] do_switch(int[] i) 
	 {
	   int start=i[0];
	   int end=i[i.length-1];
	   
	   ArrayList<Integer> mylist=new ArrayList<>();
	   for(int z=0; z<i.length; z++){
	     mylist.add(i[z]);
	   }
	mylist.set(0, end);
	mylist.set(i.length-1, start);
	          for(int y=0; y<mylist.size(); y++){
	            i[y]=mylist.get(y);
	          }
	          return i;
		}
}
