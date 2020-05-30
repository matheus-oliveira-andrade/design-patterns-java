package com.estrutural.adapter;

// Adaptee --> Adapta��o
public class LoggerCustom implements InterfaceloggerCustom{

	@Override
	public void logInfo(String mensagem) {
		/* Opera��es */
		
		System.out.println("Log customizado: " + mensagem);		
	}

	@Override
	public void logError(Exception exception) {
		/* Opera��es */
		
		System.out.println("Log customazado: " + exception.getMessage());		
	}

}
