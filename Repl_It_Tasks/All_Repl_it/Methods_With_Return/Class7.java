package Methods_With_Return;

import java.util.Scanner;

public class Class7 {
	static Scanner scan=new Scanner(System.in);
	  static public void main(String[] str){
	    boolean A=scan.nextBoolean(), B=scan.nextBoolean(), C=scan.nextBoolean();
	    System.out.println(threeLocks(A,B,C));
	  }
	  
	  public static boolean threeLocks(boolean a, boolean b, boolean c) {
	    boolean AA=false;
	    if((a==true&&b==true)||c==true) AA=true;
	    return AA;
	    
	  }//end threeLocks
}
