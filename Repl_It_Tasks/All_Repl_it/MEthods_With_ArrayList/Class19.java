package MEthods_With_ArrayList;

import java.util.ArrayList;

public class Class19 {
	public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) 
	  {
	    int AA=0, count=0;
	    for(int i=0; i<deliveries.size(); i++){
	      if(deliveries.get(i)%max_fuel==0) AA+=(deliveries.get(i)/max_fuel);
	      if(deliveries.get(i)%max_fuel!=0) count=1;
	    }
	    return AA+count;
	  }
	  
	  public static void main(String[] args)
	  {
	    
	    ArrayList<Integer>  arr = new ArrayList<>();
	    arr.add(3);
	    arr.add(3);
	    arr.add(1);
	    arr.add(2);
	    arr.add(6);
	    int times = refuel_times(arr,3);
	    System.out.print(times);//should output 5
	   
	    
	  }//end main
}
