package MEthods_With_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Class12 {
	public static void main(String[] args)
	{
		ArrayList<Boolean> myB=new ArrayList<>(Arrays.asList(true, false, false));
		repeatAL(myB);
	}
	//create your method below
	public static void repeatAL(ArrayList<Boolean> AA){
	 AA.addAll(AA);
	  System.out.println(AA);
	}
}
