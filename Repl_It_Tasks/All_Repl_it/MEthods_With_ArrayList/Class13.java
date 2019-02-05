package MEthods_With_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Class13 {
	public static void main(String[] args)
	{
	  ArrayList<Integer> myints=new ArrayList<>(Arrays.asList(1,5,3,7));
		System.out.println(twoTimes(myints));
	}
	//create your method below
	static ArrayList<Integer> twoTimes(ArrayList<Integer> AA){
	  ArrayList<Integer> BB=new ArrayList<>(AA);
	  int z=0;
	  for(int i=0; i<AA.size(); i++){
	    BB.add(z,AA.get(i));
	    z+=2;
	  }
	  return BB;
	}
}
