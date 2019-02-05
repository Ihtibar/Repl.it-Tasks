package Methods_With_Return;

import java.util.Scanner;

public class Class10 {
	 static Scanner scan=new Scanner(System.in);
	  static public void main(String[] str){
	    boolean AA=scan.nextBoolean(), BB=scan.nextBoolean();
	    int CC=scan.nextInt(), DD=scan.nextInt(), EE=scan.nextInt();
	    System.out.println(getThunderBlazz(AA,BB,CC,DD,EE));
	    
	  }
	  public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1 
	  , int ingredient2, int ingredient3)
	  {
	    boolean FF=false;
	    if(available == true || gift==true) FF=true;
	    else if(((ingredient1==1 && ingredient2==2)&&ingredient3==3)||((ingredient1==3 &&ingredient2==1)&&ingredient3==2)) FF=true;
	    return FF;
	  }
}
