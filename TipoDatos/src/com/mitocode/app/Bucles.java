package com.mitocode.app;

public class Bucles {
	
	public static void main(String[] args) {
		
//		for (int i=0; i<5;i++) {
//			if(i==2) {
//				continue;
//			}
//			System.out.println(i);
//		}
		escape:
		for (int i=0; i<5;i++) {
			for (int j=0; j<5;j++){			
			System.out.println(i+j);
			if(j==1) {
			break escape;
		}}}
	}

}
