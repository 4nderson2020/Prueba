package com.mitocode.scope;

public class App {
	
	
	public static void main(String[] args) {
//		Protected app = new Protected();
//		app.apellidos = "Code";
//		System.out.println(app.apellidos);
//		app.metodoA();
		
		Default app = new Default();
		app.apellidos = "Code";
		System.out.println(app.apellidos);
		app.metodoA();
	}
}
