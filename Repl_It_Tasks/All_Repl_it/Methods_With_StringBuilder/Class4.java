package Methods_With_StringBuilder;

public class Class4 {
	public boolean isSame(String a,StringBuilder b) 
	  {
	    boolean A=false;
	    String B=b.toString();
	    if(a.equals(B))A=true;
	  return A;
	  }
	  
	  public static void main(String[] args)
	  {
		  Class4 m = new Class4();
	    
	    
	    boolean tst = m.isSame("test",new StringBuilder("test"));
	    System.out.print(tst);

	   
	    
	  }//end main
}
