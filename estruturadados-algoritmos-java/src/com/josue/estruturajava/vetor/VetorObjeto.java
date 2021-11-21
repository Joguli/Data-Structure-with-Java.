package com.josue.estruturajava.vetor;

public class VetorObjeto {

	private Object[] elementos;
	private int tamanho;
	
//  Refazer Aula 5  **************************************************************
	
	public VetorObjeto(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	
	public boolean adiciona(Object elemento){
		this.aumentaCapacidade();
		if(this.tamanho <= this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	// ----------------------------------------------------------------------
	public boolean adiciona(int posicao, Object elemento) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Argumento inválido. ");
		}
		this.aumentaCapacidade();

		 	for(int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}
	//------------------------------------------------------------------------
	
	public void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			Object[] elementosNovos = new Object[this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	
	public Object busca(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("\n\n\t >>> Posição inválida! <<<\n ");
		}
		
		return this.elementos[posicao];
	}
	
	public int busca(Object elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			} 
		}
		return -1;
	}
	// REMOVE  ========================================================================
	public void remove(int posicao) {
		
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Argumento inválido. ");
		}
		
		for(int i = posicao; i < this.tamanho - 1; i++) {
					this.elementos[i] = this.elementos[i + 1];					
		}
		
		this.tamanho--;
	}
	
	
	// REMOVE ==========================================================================
	
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
