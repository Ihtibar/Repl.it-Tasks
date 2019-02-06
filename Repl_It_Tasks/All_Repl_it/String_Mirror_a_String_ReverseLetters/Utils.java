package String_Mirror_a_String_ReverseLetters;

public class Utils{
	  public static String reverseLetters(String word){
	    
			//TODO
			int a = word.length(), b = a-1;
		    char[] revwordArr = new char[a];
		    for (int i=0; i < a; ) {
		        if(!Character.isAlphabetic(word.charAt(i))) {
		            revwordArr[i] = word.charAt(i);
		            i++;
		        } else if (!Character.isAlphabetic(word.charAt(b))) {
		            revwordArr[b] = word.charAt(b);
		            b--;
		        } else {
		            revwordArr[b] = word.charAt(i);
		            revwordArr[i] = word.charAt(b);
		            b--;
		            i++;
		        }
		    }

		    return new String(revwordArr);
		}
	}