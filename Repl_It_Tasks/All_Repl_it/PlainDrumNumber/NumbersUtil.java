package PlainDrumNumber;

public class NumbersUtil{
	  
	  public static boolean isPalindrome(int number) {
	    //Write your code here.
	    String mynum= ""+number;
	    String mynum2="";
	    StringBuilder mybuilder= new StringBuilder(mynum);
	    mynum2=mybuilder.reverse().toString();
	    
	    if(mynum2.equals(mynum)) return true;
	    
	    return false;
	  }
	}