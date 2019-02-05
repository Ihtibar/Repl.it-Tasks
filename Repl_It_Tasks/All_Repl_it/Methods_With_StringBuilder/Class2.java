package Methods_With_StringBuilder;

public class Class2 {
	 public boolean toBe(StringBuilder r) 
	  {
	    boolean C=false;
	    String[] A=r.toString().split(",");
	    for(String B: A){
	      if(B.equals("true")) C=true;
	    }
	    return C;
	   
	  }
	  
	  public static void main(String[] args)
	  {
		  Class2 m = new Class2();
	    
	    StringBuilder  bool = new StringBuilder("true,false");
	    
	    boolean tst = m.toBe(bool);
	    System.out.print(tst);

	   
	    
	  }//end main
}
