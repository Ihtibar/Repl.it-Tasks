package MEthods_With_ArrayList;

import java.util.ArrayList;

public class Class20 {
	public static boolean nanuk(ArrayList<String> r,int way_stones,int boast) 
	  {
	    int countNanuk=0, hunts=0;
		  boolean AA=false;
		  
		  if(r.contains("nanuk")) {
			  do{
				  r.remove("nanuk");
				  countNanuk++;
			  }while(r.contains("nanuk"));
		}
		  for(String str:r) {
			  hunts+= Integer.parseInt(str);
		  }
		  if((countNanuk<=way_stones)&&hunts>=boast) AA=true;
		  return AA;
	    
	  }
	  
	  public static void main(String[] args)
	  {
	   
	    ArrayList<String>  arr = new ArrayList<String>();
	    arr.add("2");
	    arr.add("6");
	    arr.add("nanuk");
	    arr.add("nanuk");
	    
	  
	    boolean hunt = nanuk(arr,2,10);
	    if(hunt)
	    {
	      System.out.print("successful hunt");
	    }
	    else
	    {
	      System.out.print("this hunt is doomed");
	    }
	    
	  
	   
	    
	  }//end main
}
