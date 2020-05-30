package com.estrutural.adapter;

// Target --> Forma atual
public class Logger implements InterfaceLogger{

	@Override
	public void log(String mensagem) {
		/* Operações */
		
		System.out.println("Log padrão: " + mensagem);		
	}

	@Override
	public void logError(Exception exception) {
		/* Operações */
		
		System.out.println("Log padrão: " + exception.getMessage());		
	}

}
