package com.josue.estruturajava.vetor.teste;

import com.josue.estruturajava.vetor.Lista;
import com.josue.estruturajava.vetor.VetorObjeto;

public class Aula11 {

	public static void main(String[] args) {
		
		Lista<Contato> vetor = new Lista<Contato>(1);
		Contato c1 = new Contato("Contato 1 ", "1239-4568", "asdg@gamil");
		vetor.adiciona(c1);
		
		System.out.println(c1);
		
		System.out.println(vetor);
	}

}
