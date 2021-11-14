package com.josue.estruturajava.vetor;

import java.util.Arrays;

//import com.sun.tools.classfile.StackMapTable_attribute.append_frame;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
//  Refazer Aula 5  **************************************************************
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	/*
	public void adiciona(String elemento) {
		for(int i = 0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}
	
	public void adiciona(String elemento) throws Exception {
		
		if(this.tamanho <= this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}else {
			throw new Exception(" Não é possível adicional, vetor cheio.");
		}
		
	}*/
	
	public boolean adiciona(String elemento){
		
		if(this.tamanho <= this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public String busca(int posicao) {
		
		return this.elementos[posicao];
	}
	
	public int tamanho() {
		return this.tamanho;
}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho -1]);
		}
		s.append("]");
		
		return s.toString();
	}


}
