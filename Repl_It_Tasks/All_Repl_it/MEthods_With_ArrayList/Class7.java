package MEthods_With_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Class7 {
	static public void main(String[] str){
	    ArrayList<String> mylist=new ArrayList<>();
	    mylist.addAll(Arrays.asList("hello", "How","Why","When"));
	    test(mylist);
	  }
		public static void test(ArrayList<String> words)
		{
			//write code here
			words.add(0,"hey");
				words.add(3,"yo");
				System.out.println(words);
		}
}
