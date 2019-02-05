package Methods_With_Arrays;

public class Class6 {
	 static public void main(String[] args){
		    int[] products={1,1,1,1};
		    int limit=5;
		   System.out.println(badP(products,limit));
		  }
		  
		  public static boolean badP(int[] products,int limit)
		  {
		    int AA = 0;
		    boolean BB=false;
		        for (int i = 0; i < products.length; i++) {
		            if (products[i] == 0) AA++;
		        }
		        if (AA < limit)  BB=true;
		            return BB;
		  }
}
