package com.criacional.singleton;

public final class Presidente {

	private static Presidente presidente = new Presidente();
	
	private Presidente() {		
	}
	
	public static Presidente getInstance() {
		return presidente;
	}	
}
