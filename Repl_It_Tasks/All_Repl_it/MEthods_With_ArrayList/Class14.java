package MEthods_With_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Class14 {
	public static void main(String[] args)
	{
	  ArrayList<String> myarr=new ArrayList<>(Arrays.asList("hi","yo","sup","yolo","boop"));
	  removeEveryOther(myarr);
		
	}
	//create your method below
	static void removeEveryOther(ArrayList<String> words){
	          int z=4;
	        for(int i=0; i<words.size(); i++){
	          words.remove(z);
	          z-=2;
	          if(z<0) break;
	        }
	        System.out.println(words);
	}
}		
