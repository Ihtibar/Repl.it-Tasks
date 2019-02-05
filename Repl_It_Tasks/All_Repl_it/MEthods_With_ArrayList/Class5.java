package MEthods_With_ArrayList;

import java.util.ArrayList;

public class Class5 {
	static public void main(String[] arg){
	    ArrayList<Integer> mylist2=new ArrayList<>();
	    System.out.println(sum(mylist2));
	  }
		public static int sum(ArrayList<Integer> ints)
		{
			//write code here
			int sum=0;
			for(int i=0; i<ints.size(); i++){
			  sum+=ints.get(i);
			}
			return sum;
		}
}
