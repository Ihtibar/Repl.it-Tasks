package Methods_With_String;

import java.util.*;

public class Class15 {
	static public void main(String[] args){
	    Scanner scan=new Scanner(System.in);
	    String word1=scan.next(), word2=scan.next();
	    System.out.println(isAnagram(word1,word2));
	    scan.close();
	  }
	  
	  public static boolean isAnagram(String word1, String word2) {
	    boolean AA=false;
	    char[] BB=word1.toCharArray();
	    char[] CC=word2.toCharArray();
	    Arrays.sort(BB);
	    Arrays.sort(CC);
	    if(word1.length() == word2.length()){
	      for(int i=0; i<word1.length(); i++){
	        if(BB[i]==CC[i]) AA=true;
	      }
	    }
	    return AA;
	  }
}
