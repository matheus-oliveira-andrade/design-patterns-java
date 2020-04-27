package com.estrutural.facade;

public class CodigoSegurancaCheck {

	private int codigoSeguranca = 1234567;
	
	public int getCodigoSeguranca() {
		return codigoSeguranca;
	}
	
	public boolean isValidCodigoSeguranca(int codigoSeguranca) {		
		return this.codigoSeguranca == codigoSeguranca;		
	}
}
