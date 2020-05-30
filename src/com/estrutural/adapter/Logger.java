package com.estrutural.adapter;

// Target --> Forma atual
public class Logger implements InterfaceLogger{

	@Override
	public void log(String mensagem) {
		/* Opera��es */
		
		System.out.println("Log padr�o: " + mensagem);		
	}

	@Override
	public void logError(Exception exception) {
		/* Opera��es */
		
		System.out.println("Log padr�o: " + exception.getMessage());		
	}

}
