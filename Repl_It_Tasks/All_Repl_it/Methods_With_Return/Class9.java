package Methods_With_Return;

import java.util.Scanner;

public class Class9 {
	 static Scanner scan = new Scanner(System.in);
	  static public void main(String[] str){
	    boolean AA=scan.nextBoolean();
	    int BB=scan.nextInt(), CC=scan.nextInt(), DD=scan.nextInt();
	    System.out.println(simpleRoomBook(AA,BB,CC,DD));
	  }
	  public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
	  {
	    boolean EE=false;
	    if(year==2018){
	      if(!(month==7&&(day>=1&&day<=8))){
	        if(isAvailable==true){
	          EE=true;
	        }
	      }
	    }
	    return EE;
	  }
}
