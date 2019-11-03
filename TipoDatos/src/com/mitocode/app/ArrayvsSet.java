package com.mitocode.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayvsSet {

	public static void main(String[] args) {
		List<String> listaArray = new ArrayList<>();
		//Set<String> setHash = new HashSet<>();
		Set<String> setHash = new TreeSet<>();
		
		
		listaArray.add("Mito");
		listaArray.add("Code");
		listaArray.add("Mito");
		
		listaArray.forEach(System.out::println);
		
		System.out.println("------------------------------");
		
		setHash.add("Mito");
		setHash.add("Code");
		setHash.add("Mito");
		
		setHash.forEach(System.out::println);
		
		
	}
}
