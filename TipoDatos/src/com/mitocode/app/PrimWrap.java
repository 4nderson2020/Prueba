package com.mitocode.app;

public class PrimWrap {

	public static void main(String[] args) {
		
		String x = new String("xyz");
		String y = new String("xyz");
		
		//String x = "xyz";
		//String y = "xyz";
		
//		if(x==y) {
		if(x.equals(y)) {
			System.out.println("x==y TRUE");
		}else {
			System.out.println("x==y FALSE");
		}

	}

}
