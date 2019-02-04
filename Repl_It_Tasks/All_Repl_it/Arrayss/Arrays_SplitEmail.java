package Arrayss;

import java.util.Scanner;
public class Arrays_SplitEmail {
	 public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    String email = input.nextLine();
		    
		    //Write your code below
		     String[] str=email.split("@");
					    int count=0;
					    char[] AA=email.toCharArray();
					    for(char BB:AA) {
					  if(BB=='@') count+=1;
					  }
					  if(count>1||count==0){
					    System.out.println("invalid email");
				 }else {
					 System.out.println("Email id: "+str[0]);
					    System.out.println("Email domain: "+str[1]);
				 }
					  input.close();
		  }

}
