package Methods_With_2DArrays;

public class Class1 {
	 public static  double convertC(String[][] money,String[][] convertionRate) 
	  {
	    double sum=0;
	    double[] myarr=new double[money.length];
	    double[] myarr2=new double[convertionRate.length];
	    
	    if(money.length==convertionRate.length){
	    for (int i=0; i<money.length; i++){
	  
	       myarr[i]=Double.parseDouble(money[i][money[i].length-1]);
	       myarr2[i]=Double.parseDouble(convertionRate[i][convertionRate[i].length-1]);
	          sum+=(myarr[i]*myarr2[i]);
	        
	      }
	    }
	  return sum;
	  
	  }
	  
	    public static void main(String[] args) 
	   {
	     
	     
	     
	     String[][] test_money =
	     {
	       {"mark","5"},
	       {"shekel","30.5"},
	     };
	     
	     String[][] test_convert=
	     {
	       {"mark","1"},
	       {"shekel","0.5"},
	     };
	     
	     double res = Class1.convertC(test_money,test_convert);
	     System.out.print(res);
	     
	   }
}
