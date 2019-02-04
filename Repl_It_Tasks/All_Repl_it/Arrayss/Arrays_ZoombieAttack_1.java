package Arrayss;

			/*
			 *  Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
				Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
			    Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
				Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
						---- EXTINCT ----
			 */

import java.util.*;
public class Arrays_ZoombieAttack_1 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] populations = new int[8];
	    for(int i=0; i<populations.length; i++) 
	      populations[i] = input.nextInt();    
	    
	    //TODO. Write you code below this line. 
	    int[] newpopus = new int[populations.length];
	    int days=0;
			System.out.println("Day "+days+" " + Arrays.toString(populations));
			do {
				for (int i = 0; i < populations.length; i++) 
					newpopus[i] = (populations[i] /= 2);
				
				int EndIsNear = 0;
				for (int z : newpopus) 
					EndIsNear += z;
				
				days++;
				System.out.println("Day " + days + " " + Arrays.toString(newpopus));
				if (EndIsNear == 0){
				  System.out.println("---- EXTINCT ----");
					break;
				}
			} while (true);
	       input.close();
	  }
}