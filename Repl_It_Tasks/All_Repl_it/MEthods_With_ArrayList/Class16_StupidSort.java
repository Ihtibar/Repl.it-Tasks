package MEthods_With_ArrayList;

public class Class16_StupidSort {
	public static int[][] stupidSort(int[] i) 
	{
	 int cnt = 0; 
          while(!isSorted(i)) 
          {  cnt++; 
              shuffle(i); 
  
 
          } 
          int[][] rtn = new int[2][]; 
          rtn[0] = new int[] { cnt }; 
          rtn[1] = i; 
          return rtn; 
	}//end stupidSort
	
public static int[] shuffle(int[] i) 
{
		for(int x = 0; x < i.length; ++x) { 
              int index1 = (int) (Math.random() * i.length), 
                  index2 = (int) (Math.random() * i.length); 
              int a = i[index1]; 
              i[index1] = i[index2]; 
              i[index2] = a; 
          } 
          return i; 
	}//end shuffle
	
	private static boolean isSorted(int[] i) 
	{
	  boolean isSort = true; 
        for (int k = 0; k < i.length - 1; k++) { 
              if (i[k] > i[k + 1]) { 
                  isSort = false; 
                  break; 
              } 
          } 
          return isSort; 
	  
	}//end isSorted
	

}
