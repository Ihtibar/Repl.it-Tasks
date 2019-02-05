package Methods_With_Arrays;

import java.util.*;

public class Class4 {
	static public void main(String[] str){
	    Scanner scan=new Scanner(System.in);
	    int size=scan.nextInt();
			 String[] BB=new String[size];
			 for(int i=0; i<BB.length; i++){
			   BB[i]=scan.next();
			 }
			    System.out.println(getDup(BB));
			    scan.close();
			  }
			  
			  public static int getDup(String[] r) 
			  {
					ArrayList<String> mystrings = new ArrayList<>();
					for (int i = 0; i < r.length; i++) {
						int AA = 0;
						for (int z = 0; z < r.length; z++) {
				
							if (r[i].equals(r[z])) AA++;
							
						}if(AA>1)  mystrings.add(r[i]);	
					}
					r=mystrings.toArray(new String[mystrings.size()]);
					return r.length;
	  }
}
