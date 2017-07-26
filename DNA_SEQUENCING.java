package Package;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DNA_SEQUENCING {

	public static void  getNucleotide(String dna_sequence) {
		char[] dna_nucleotides = dna_sequence.toCharArray();
		char nucleotide = dna_nucleotides[0];
		int nucleotide_length = 1;
		int[] nucleotide_length_array = new int[dna_nucleotides.length];
		Arrays.fill(nucleotide_length_array, 1);
		for(int i=1;i<nucleotide_length_array.length;i++){
			if(dna_nucleotides[i]==dna_nucleotides[i-1]) {
				nucleotide_length_array[i]=nucleotide_length_array[i-1]+1; 
				if(nucleotide_length_array[i-1]+1 >=nucleotide_length) {
					nucleotide_length = nucleotide_length_array[i];
					nucleotide = dna_nucleotides[i];
				}
			}
		}
		if(nucleotide_length == 1) {
			nucleotide = dna_nucleotides[dna_nucleotides.length-1];
		}
		
		System.out.println("nucleotide "+nucleotide+" length "+nucleotide_length);
	}
	public static boolean checkValidity(String dna_sequence) {
		Pattern pattern = Pattern.compile("[^ATGC ]");
		Matcher matcher = pattern.matcher(dna_sequence);
		boolean result = matcher.find();
		if(result || dna_sequence.isEmpty() || dna_sequence.length()>10000) {
			return false;
		}
		return true;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the DNA Sequence");
		String dna_sequence = scanner.nextLine();
		if(checkValidity(dna_sequence)) {
			getNucleotide(dna_sequence);
		} else {
			System.out.println("The DNA Sequence is not valid");
		}
	
	}
}
