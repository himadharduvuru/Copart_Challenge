

import java.util.Scanner;

public class Piece_of_cake {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			
			
			
			/*
			 * the minimum perimeter is the square root of the area. 
			 */
			
			Scanner sc= new Scanner (System.in);
			
			//  total_cakes stores the values for the total number of cakes
			
			int total_cakes = sc.nextInt();
			
			
			// The below arrays are to store the area and perimeters of individual cakes
			long[] area= new long[total_cakes];
			long[] perimeter=new long[total_cakes];
			
			int count =0;
			
			// Reads the input values from the user for cakes area and stores them in "area"
			
			while(total_cakes>0 && total_cakes<101){
				area[count++]=sc.nextLong();
				--total_cakes;
				}
			
			int i=0;
			// Calculate the minimum perimeter for the areas individually and stores them in the perimeter array
			
			for(long k:area){
				perimeter[i]=(4*Math.round(Math.sqrt(k)));
				 i++;
			}
			
			// displays the final output values
			
			for(long j:perimeter){
				System.out.println(j);
			}

		}

	}

