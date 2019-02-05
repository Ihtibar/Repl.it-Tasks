package Methods_With_String;

import java.util.Scanner;

public class Class13 {
	static public void main(String[] args){
	    Scanner scan=new Scanner(System.in);
	    String line=scan.next();
	    isError(line);
	    scan.close();
	  }
	  public static boolean isError(String line) 
	  {
	    boolean AA=false;
	    String[] myarr=line.split(" ");
	    if(myarr[0].equals("error")) AA=true;
	    return AA;
	  }
}
