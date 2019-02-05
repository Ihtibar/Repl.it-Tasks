package MEthods_With_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Class9 {
	static public void main(String[] args){
	    String BB="hi";
	    ArrayList<String> AA=new ArrayList<>();

	   removeAll(AA,BB);
	  }

		//create your method below
		static void removeAll(ArrayList<String> wordList, String targetWord){
		  ArrayList<String> removthese=new ArrayList<>(Arrays.asList(targetWord));
		 wordList.removeAll(removthese);
		  System.out.println(wordList);
		}
}
