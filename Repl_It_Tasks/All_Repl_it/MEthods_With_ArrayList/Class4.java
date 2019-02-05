package MEthods_With_ArrayList;

import java.util.ArrayList;

public class Class4 {
	 static public void main(String[] args){
		    ArrayList<String> mylist2=new ArrayList<>();
		    test(mylist2);
		  }
			public static void test(ArrayList<String> words)
			{
				//write code here
				words.set(0, "git");
				words.set(2,"gud");
				System.out.println(words);
			}
}
