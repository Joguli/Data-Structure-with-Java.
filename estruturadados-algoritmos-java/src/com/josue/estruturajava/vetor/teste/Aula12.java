package com.josue.estruturajava.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		arrayList.add(1, "B");
		boolean existe = arrayList.contains("A");

		System.out.println(arrayList);
		
		if(existe){
			System.out.println("Elemento existe no array. ");
		}else {
			System.out.println("Elemento não existe no array. ");
		}
		
		int pos = arrayList.indexOf("B");
		if(pos > -1) {
			System.out.println("Elemento exixte no array. " + pos);
		}else {
			System.out.println("Elemento não exixte no array. " + pos);
		}
		
		arrayList.remove(pos);
		System.out.println(arrayList);
		System.out.println(arrayList.size());	
	}

}



















