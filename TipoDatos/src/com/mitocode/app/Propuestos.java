package com.mitocode.app;

import java.util.Random;
import java.util.Scanner;

public class Propuestos {

	public void pregunta1() {
		int numero = 1;
		
//		if(numero>=0) {
//			System.out.println("positivo");
//		}else {
//			System.out.println("negativo");
//		}
		
//		String Rpta = numero >= 0 ? "positivo":"negativo";
		String Rpta = numero >= 0 ? "positivo":(numero == 1 ? "uno":"dif 1");
		System.out.println(Rpta);
	}
	
	public void pregunta2() {
			
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un número");
		int numero = teclado.nextInt();
		
//		if(numero % 2 == 0) {
//			System.out.println("el numero es par");
//		}else {
//			System.out.println("el numero es impar");
//		}
		
		String rpta = numero %2 == 0 ? "el numero es par ": "el numero es impar";
		System.out.println(rpta);
		
		teclado.close();
		}
	
	public void pregunta3() {
	
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Ingrese un numero 1: ");
	//		int numero1 = teclado.nextInt();
		Integer numero1 = 2;
	
		System.out.println("Ingrese un numero 2: ");
		int numero2 = teclado.nextInt();
	
		System.out.println("Ingrese un numero 3: ");
		int numero3 = teclado.nextInt();
	
		if (numero1 != null) {
			if (numero1 > numero2) {
				if (numero1 > numero3) {
					System.out.println("El mayor es : " + numero1);
				} else {
					System.out.println("El mayor es : " + numero3);
				}
			} else if (numero2 > numero3) {
				System.out.println("El mayor es : " + numero2);
			} else {
				System.out.println("El mayor es : " + numero3);
			}
			teclado.close();
		}
	}

	public void pregunta4() {
		
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Ingrese texto : ");
//		String texto = teclado.next();
//		
//		StringBuilder sb = new StringBuilder(texto);
//		String reversa = sb.reverse().toString();
//		
//		String rpta = texto.equalsIgnoreCase(reversa)? "capicua":"no es capicua";	
//		System.out.println(rpta);
//		
//		teclado.close();
//		
		long ini = System.currentTimeMillis();
//		String cadena = "";
//		for(int i = 0 ; i<100000; i++) {
//			cadena = cadena +1;
//		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i<100000; i++) {
		sb.append(i);
	}
		
		long fin = System.currentTimeMillis();
		System.out.println(fin-ini);
		
	}

	public void pregunta5() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese cadena de texto");
		
		String texto = teclado.nextLine();
		Random generador = new Random();
		int num = generador.nextInt(100);
		
//		texto = texto.replace(String.valueOf(texto.charAt(0)),String.valueOf(num));
		texto = texto.replaceAll("\\s", "");
		System.out.println(texto);
		
		teclado.close();
	}
	
	
	public static void main(String[] args) {
		Propuestos p = new Propuestos();
		p.pregunta5();
	}

}
