package com.josue.estruturajava.vetor.teste;

import com.josue.estruturajava.vetor.VetorObjeto;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjeto vetor = new VetorObjeto(3);
		
		Contato c1 = new Contato("Contato 1 ", "1239-4568", "asdg@gamil");
		Contato c2 = new Contato("Contato 2 ", "8731-2569", "contato2@gamil.com");
		Contato c3 = new Contato("Contato 3 ", "6832-5564", "contato3@hotmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.busca(c1);
		if(pos > -1) {
			System.out.println("Elemento existe no vetor. ");
		}else {
			System.out.println("Elemento não existe no vetor. ");
		}
		System.out.println(vetor);
	}
}
