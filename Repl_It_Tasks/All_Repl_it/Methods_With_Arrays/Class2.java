package Methods_With_Arrays;

import java.util.*;

public class Class2 {
	static public void main(String[] args){
	    Scanner scan=new Scanner(System.in);
	    int size=scan.nextInt();
	    int[] BB=new int[size];
	    for(int i=0; i<size; i++){
	      BB[i]=scan.nextInt();
	      scan.close();
	    }
	    int C=scan.nextInt();
	    System.out.println(Arrays.toString(deleteR(BB,C)));
	  }
	   public static int[] deleteR(int[] arr,int element) {
		 int[] AA=new int[arr.length-1];
		ArrayList<Integer> mylist=new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			mylist.add(arr[i]);
		}
		mylist.remove(new Integer(element));
		 for(int z=0; z<mylist.size(); z++) {
			 AA[z]=mylist.get(z);
		 }
		   return AA;
  }//end deleteR
  
}
