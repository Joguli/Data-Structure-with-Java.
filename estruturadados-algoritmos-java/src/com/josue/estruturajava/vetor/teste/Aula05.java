package com.josue.estruturajava.vetor.teste;

import com.josue.estruturajava.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("Elemento 1");//0
		vetor.adiciona("Elemento 2");//1
		vetor.adiciona("Elemento 3");//2
		
		System.out.println(vetor.busca(0));
		System.out.println(vetor.busca("Elemento 1"));
		System.out.println(vetor.busca("elemento 2"));
		//  Refazer Aula 5  ****************************************************
	}

}
