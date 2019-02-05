package Methods;

import java.util.Scanner;

public class Methods8 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    String s = inp.next();
	    person(s) ;
	    inp.close();
	  }
	  
	   public static void person(String info) 
		{
		
			//your code here
			String[] AA=info.split(",");
			System.out.println("person name: "+AA[0]+" last name: "+AA[1]+" age: "+AA[2]);
		
		}//end person

}
