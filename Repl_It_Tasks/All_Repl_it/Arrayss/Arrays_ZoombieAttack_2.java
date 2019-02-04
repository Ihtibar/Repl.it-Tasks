package Arrayss;

				/*
				 *  Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
					Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
					Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
					Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
					Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
					Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
							---- EXTINCT ----
				 */

import java.util.*;
public class Arrays_ZoombieAttack_2 {
	
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    
	    int cnt = 0, sum = 0;
	       System.out.println("Day " + cnt + " " + Arrays.toString(inhabitants));

	       do {
	           for (int i = 0; i < inhabitants.length; i++) {
	               if (i < inhabitants.length - 1) {
	                   if (inhabitants[i] != 0 && inhabitants[i + 1] == 0) {
	                       inhabitants[i] /= 2;
	                   }

	                   if (inhabitants[i] == 0 && inhabitants[i + 1] != 0) {
	                       inhabitants[i + 1] /= 2;
	                       i += 1;
	                   }
	               }
	           }
	           sum = 0;
	           for (int n : inhabitants) {
	               sum += n;
	           }
	           cnt++;
	           System.out.println("Day " + cnt + " " + Arrays.toString(inhabitants));
	       } while (sum > 0);

	       System.out.println("---- EXTINCT ----");
	       input.close();
	  }

}