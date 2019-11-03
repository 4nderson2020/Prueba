package com.mitocode.app;

import java.util.ArrayList;
import java.util.Iterator;

public class Ciclos {

	public static void main(String... andy) {
		
//		String [] arreglo  = {"anderson","cajusol"};
		
		ArrayList lista = new ArrayList<>();
		lista.add("anderson");
		lista.add("cajusol");
		
		//1.5
		Iterator e = lista.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}

		//1.6
//		for(int  i=0; i< arreglo.length;i++) {
//			System.out.println(arreglo[i]);
//		}
		
		for(int  i=0; i< lista.size();i++) {
			System.out.println(lista.get(i));
		}

		//1.7
//		for (String x : arreglo) {
//			System.out.println(x);
//		}
		for (Object x : lista) {
			System.out.println(x);
		}
		
		//1.8
		lista.forEach(x->System.out.println(x));
		lista.stream().forEach(System.out::println);
	}

}
