package com.josue.estruturajava.vetor.teste;

public class Revisar {

	public static void main(String[] args) {
		
		int[] vetor = new int[5];
		
		vetor[0] = 2;
		vetor[1] = 3;
		vetor[2] = 4;
		vetor[3] = 5;
		vetor[4] = 6;
		
		int var = vetor.length -1;
		
		if(vetor[0] > 1) {
			for(int i = var; i > 0; i--) {
				vetor[i] = vetor[var];
				
				System.out.println(vetor[i]);
				var --;
			}
			if(vetor[0] > 1) {
				vetor[0] = 1;
				
				System.out.println(vetor[0] = 1);
			}
		}
	
		System.out.println("\nO menor número é = " + vetor[0]);
		
		

	}

}
