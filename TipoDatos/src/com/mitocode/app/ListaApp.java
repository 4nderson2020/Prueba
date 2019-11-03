package com.mitocode.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaApp {
	
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>(20);//Se reserva en memoria 20 espacios
		
		// |1|2|3|4|5|6|7|8|9|10|11|12|13|141|15|16|17|18|19|20|
		//add....---garbage collector
		// new ArrayList capacidad de 21
		// |1|2|3|4|5|6|7|8|9|10|11|12|13|141|15|16|17|18|19|20|21|--garbage collector
		// new ArrayList capacidad de 21
		// |1|2|3|4|5|6|7|8|9|10|11|12|13|141|15|16|17|18|19|20|21|22 
		
		
		
		List<Integer> lista2 = new LinkedList<>();
		
		long ini = System.currentTimeMillis();
		for (int i=0;i < 10000000;i++) {
			lista.add(i);
		}
		long fin=System.currentTimeMillis();
		
		System.out.println("ArrayList: "+(fin-ini));
		
		ini = System.currentTimeMillis();
		for (int i=0; i<10000000;i++) {
			lista2.add(i);
			
		}
		fin = System.currentTimeMillis();
		System.out.println("LinkedList: "+(fin-ini));
		
//		lista.add("Mito");
//		lista.add("feriado");
//		lista2.add("nov");
		
//		for(String elemento:lista) {
//			System.out.println(elemento);
//		}
		
//		lista.forEach(x-> System.out.println(x));
		
	}

}
