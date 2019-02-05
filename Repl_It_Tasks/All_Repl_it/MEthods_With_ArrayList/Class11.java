package MEthods_With_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Class11 {
	public static void main(String[] args)
	{
		ArrayList<Integer> num=new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
		System.out.println(appendPosSum(num));
	}
	//create your method below
	static ArrayList<Integer> appendPosSum(ArrayList<Integer> A){
	  ArrayList<Integer> B=new ArrayList<>();
	  for(int i=0; i< A.size(); i++){
	    if(A.get(i)>0) B.add(A.get(i));
	  }
	  int sum=0;
	  for(int z=0; z<B.size(); z++){
	    sum+=B.get(z);
	  }
	  B.add(sum);
	  return B;
	}
}
