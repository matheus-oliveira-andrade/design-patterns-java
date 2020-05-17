package com.estrutural.adapter;

public class LoggerCustom implements InterfaceloggerCustom{

	@Override
	public void logInfo(String mensagem) {
		System.out.println("Log Customizado: " + mensagem);		
	}

	@Override
	public void logError(Exception exception) {
		System.out.println("Log customazado: " + exception.getMessage());		
	}

}
