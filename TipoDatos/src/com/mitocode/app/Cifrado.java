package com.mitocode.app;

import java.util.Scanner;

public class Cifrado {

	public static void main(String[] args) {
		final String[] ABC = { "A", "B", "C", "D", "E", "F", "J" };

		StringBuilder sb = new StringBuilder();
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese cadena a cifrar");
		String texto = teclado.next();

		System.out.println("Ingrese nivel del Cifrado");
		int desplazamiento = teclado.nextInt();

		for (int i = 0; i < texto.length(); i++) {
			char elemento = texto.charAt(i);
			for (int j = 0; j < ABC.length; j++) {
				if (String.valueOf(elemento).equalsIgnoreCase(ABC[j])) {
					int posicion = j + desplazamiento;
					if (posicion >= ABC.length) {
						int x = posicion - ABC.length;
						String cifrado = ABC[x];
						sb.append(cifrado);
						//System.out.println(cifrado);
						break;
					} else {
						String cifrado = ABC[posicion];
						sb.append(cifrado);
						//System.out.println(cifrado);
						break;
					}
				}
			}
		}
		
		System.out.println("El mensaje original es : "+texto);
		System.out.println("El mensaje cifrado es : "+sb.toString());

		teclado.close();
	}

}
