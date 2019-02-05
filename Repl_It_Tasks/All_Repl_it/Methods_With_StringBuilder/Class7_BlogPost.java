package Methods_With_StringBuilder;

import java.util.*;

public class Class7_BlogPost {
	public String blogDb(ArrayList<String[]> r,String id)  {
	      ArrayList<String> AA=new ArrayList<>();
		    for(int i=0; i< r.size(); i++){
		      for(int z=0; z<r.get(i).length; z++){
		        if(r.get(i)[0].equals(id)) 
		        	AA.add(r.get(i)[z]);
		      }
		    }
		    AA.remove(0);
		   return AA.get(0)+"\n"+AA.get(1); 
	   
	  }
	  
	  public static void main(String[] args) {
		  Class7_BlogPost m = new Class7_BlogPost();
	    ArrayList<String[]>  arr = new ArrayList<String[]>();
	    arr.add(new String[]{"1","title 1","content"});
	    arr.add(new String[]{"2","title 2","content"});
	    arr.add(new String[]{"3","title 3","content3"});

	    String post = m.blogDb(arr,"3");
	    System.out.print(post);
	    //should output:
	    //title 3 
	    //content3
	   
	    
	  }//end main
}
