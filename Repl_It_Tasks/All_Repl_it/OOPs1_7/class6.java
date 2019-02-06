package OOPs1_7;

class Carpet {
	 
	 //do not change -- Start
	  public double width,length,unitPrice,totalPrice;
	  public boolean isPersian;
	 //do not change -- End
	 
	 //Add constructors below
	  public Carpet(){
	    width=300;
	    length=300;
	    unitPrice=0;
	    totalPrice=200;
	  }
	  public Carpet(double width, double length, double unitPrice, boolean isPersian){
	    this.width=width;
	    this.length=length;
	    this.isPersian=isPersian;
	    this.unitPrice=unitPrice;
	    totalPrice=(width+length)*unitPrice;
	    if(isPersian==true)  totalPrice=totalPrice+200;
	  
	  }
	  public double getwidth() { return width;  }
	  
	  public double getlength(){ return length;   }
	  
	  public double gettotalPrice(){ return totalPrice; }
	  
	  public double getunitPrice(){ return unitPrice;   }
	  
	  public boolean getisPersian(){  return isPersian; }
	  
	public void setwidth(double width) { this.width=width;}
	  
	public void setlength(double length){this.length=length;}
	  
	public void totalprice(double totalPrice){
	  totalPrice=(length+width)*unitPrice;
	  this.totalPrice=totalPrice;
	}
	  
	public void setunitPrice(double unitPrice){this.unitPrice=unitPrice;}

	public void setisPersian(boolean isPersian){
	  this.isPersian=isPersian;  }
	}



public class class6 {
	
	public static void main(String[] args) {
		   
	    Carpet c  = new Carpet();
	    System.out.println(c.totalPrice);
	    

	  }
	
	
	
	
	

}
