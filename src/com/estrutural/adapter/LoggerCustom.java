package com.estrutural.adapter;

// Adaptee --> Adaptação
public class LoggerCustom implements InterfaceloggerCustom{

	@Override
	public void logInfo(String mensagem) {
		/* Operações */
		
		System.out.println("Log customizado: " + mensagem);		
	}

	@Override
	public void logError(Exception exception) {
		/* Operações */
		
		System.out.println("Log customazado: " + exception.getMessage());		
	}

}
