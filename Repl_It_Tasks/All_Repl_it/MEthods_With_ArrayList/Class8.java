package MEthods_With_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Class8 {
	static public void main(String[] args){
		  ArrayList<String> Alist=new ArrayList<>();
		  Alist.addAll(Arrays.asList("muhtar","mahmut","mahera"));
		   ArrayList<String> Blist=new ArrayList<>();
		   Blist.addAll(Arrays.asList("muhtar","mahmut","mahera"));
		   System.out.println(combineAL(Alist, Blist));
		}
			//create your method below
			static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){
			  String[] AA=wordList1.toArray(new String[wordList1.size()]);
			  String[] BB=wordList2.toArray(new String[wordList2.size()]);
			  ArrayList<String> AB=new ArrayList<>();
			  AB.addAll(Arrays.asList(AA));
			  AB.addAll(Arrays.asList(BB));
			  return AB;
			}
}
