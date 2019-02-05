package MEthods_With_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Class6 {
	static public void main(String[] args){
	    ArrayList<Double> mylis=new ArrayList<>();
	   mylis.addAll(Arrays.asList(1.0,2.2,3.3,4.5,5.6,6.7,7.8));
	    test(mylis);
	  }
		public static void test(ArrayList<Double> dubs)
		{
			//write code here
			dubs.set(1,0.0);
				dubs.remove(0);
				dubs.remove(new Double(0.0));
				System.out.println(dubs);
		}
}
