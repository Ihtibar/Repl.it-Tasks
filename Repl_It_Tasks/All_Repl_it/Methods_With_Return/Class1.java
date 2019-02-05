package Methods_With_Return;

import java.util.Scanner;

public class Class1 {
	 static Scanner scan=new Scanner(System.in);
	  public static void main(String[] args){
	    int size=scan.nextInt();
	  String[] str=new String[size];
	  for(int z=0; z < size; z++){
	    str[z]=scan.nextLine();
	  }
	  String word=scan.nextLine();
	  count_appearance(str,word);
	  }
	  
	  public static int  count_appearance(String[] arr,String t)
	  {
	    int count=0;
	    for(int i=0; i < arr.length; i++){
	      if(arr[i].equals(t)) count+=1;
	    }
	   return count;
	  } //end  count_appearance
}
