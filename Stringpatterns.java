package problemsolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringPatterns {
	static HashSet<StringBuilder> patterns=new HashSet<StringBuilder>();
	
	
	public static int calculateWays(int wordLen,int maxVowels) {
		
		char[] arr=new char[wordLen];
		generateAllPatterns(wordLen,arr,0);
		System.out.println(patterns);
		
		//Check All patterns with maxVowels
		for(StringBuilder str:patterns) {
			
			
		}
		
		return 0;
	}
	static void generateAllPatterns(int n, char arr[], int i) 
		{ 
			if (i == n)  
			{ 
				printPatterns(arr, n); 
			return; 
			} 

				// First assign "C" at ith position 
				// and try for all other permutations 
				// for remaining positions 
				arr[i] ='C'; 
					generateAllPatterns(n, arr, i + 1); 

				// And then assign "V" at ith position 
				// and try for all other permutations 
				// for remaining positions 
				arr[i] ='V'; 
				generateAllPatterns(n, arr, i + 1); 
		} 
	
	
	// Function to print the output 
		static void printPatterns(char arr[], int n) 
		{ 
			StringBuilder builder=new StringBuilder();
		    for (int i = 0; i < n; i++)  
		    { 
		    	builder.append(arr[i]);
		       // System.out.print(arr[i]+" "); 
		    } 
		    patterns.add(builder);
		   // System.out.println(builder); 
		} 

	public static void main(String[] args) {
		calculateWays(4, 1);

	}

}
