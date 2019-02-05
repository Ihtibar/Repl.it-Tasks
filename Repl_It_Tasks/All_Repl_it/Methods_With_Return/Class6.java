package Methods_With_Return;

import java.util.Scanner;

public class Class6 {
	static Scanner scan=new Scanner(System.in);
	  static public void main(String[] str){
	    double AA=scan.nextDouble();
	    System.out.println(waterTax(AA));
	  }
	  
	  public static double waterTax(double units)
	  {
	    double bill = 0.0;
	    //your code here
	    if(units<=50)  bill= units * 0.60;
	    else if (units >50&& units<=100) bill=units* 0.90;
	    else if(units > 100 && units<=150) bill=50+(units*0.90);
	    else bill=(units*0.90)+100;
	    //end your code here
	    return bill;
	  }//end waterTax

}
