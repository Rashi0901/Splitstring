package july9.string;

import java.util.Arrays;

public class Stringsplit {
	public static void main(String[] args) {
		
		String s = "Sharma is a good player and he is so puntual" ;
		
		
		String arr [] = s.split(" ") ;
		
		System.out.println("Reverse Words:- ");
		for(int i=0 ; i<arr.length ; i++) {
			String ss = arr[i] ;
			
			StringBuilder sb = new StringBuilder (ss);
			System.out.print(sb.reverse()+" ");
			
		}
		
		System.out.println("\n");
		System.out.println("Reverse Words In Reverse Sentence :- ");
		for(int j= arr.length-1 ; j>=0 ; j-- ) {
			String s1 = arr[j] ;
			StringBuilder st = new StringBuilder (s1);
			System.out.print(st.reverse()+" ");
		}
		System.out.println("\n");
		System.out.println("Reverse Sentence:- ");
		for(int j= arr.length-1 ; j>=0 ; j-- ) {
			String s1 = arr[j] ;
			System.out.print(s1+" ");
		}
		
		
		System.out.println(" \n");
		
		System.out.println("String Array:- "+Arrays.toString(arr));
		
		System.out.println();
		System.out.println("Length of Array:- "+arr.length);
		
	
		
		
	}

	}

