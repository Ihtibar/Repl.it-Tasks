package Methods_With_Return;

import java.util.Scanner;

public class Class8 {
	 static Scanner scan=new Scanner(System.in);
	  static public void main(String[] str){
	    boolean AA=scan.nextBoolean();
	    int BB=scan.nextInt(), CC=scan.nextInt();
	    System.out.println(validateTask(AA,BB,CC));
	  }
	  public static boolean validateTask(boolean notEmpty,int taskId,int currentId)
	  {
	    boolean DD=false;
	    if(notEmpty==false) DD=false;
	    else {
	      if(taskId==currentId+1) DD=true;
	    }
	    return DD;
	  }
}
