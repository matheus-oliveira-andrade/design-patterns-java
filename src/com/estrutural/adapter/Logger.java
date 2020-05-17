package com.estrutural.adapter;

public class Logger implements InterfaceLogger{

	@Override
	public void log(String mensagem) {
		System.out.println("Log padrão: " + mensagem);		
	}

	@Override
	public void logError(Exception exception) {
		System.out.println("Log padrão: " + exception.getMessage());		
	}

}
