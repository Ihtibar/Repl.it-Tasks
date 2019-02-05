package MEthods_With_ArrayList;

import java.util.Arrays;

public class Class1 {
	static public void main(String[] args){
	    String[] AA={"f","o","o"}, BB={" b","a","r"};
	    System.out.println(combineRs(AA,BB));
	  }
	  public static String combineRs(String[] r1,String[] r2) 
	  {
	  String A=Arrays.toString(r1).replace(",","").replace("[","").replace("]","");
	  String B=Arrays.toString(r2).replace(",","").replace("[","").replace("]","");
	  String C=A+B;
	  return C.replace(" ","");
	   
	  }
}
