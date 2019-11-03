package com.mitocode.scope;

public class Privada {
	
	private int id;
	private String nombres;
	private String apellidos;
	
	private void metodoA() {
		System.out.println("metodo privado");
	}
	
	private double metodoB() {
		String x = "hola";
		double rpta = 0;
		if(x.equalsIgnoreCase("Hola")) {
			rpta = 1.0;
		}else {
			rpta = 2.0;
		}
		return rpta;
	}
	
	private double metodoB(double numero) {
		return this.metodoB()+numero;
	}
	
	private double metodoC() {
		return this.metodoB() +metodoB(2);
	}
	
	public static void main(String[] args) {
		Privada app = new Privada();
		app.apellidos = "Code";
		System.out.println(app.apellidos);
	}

}
