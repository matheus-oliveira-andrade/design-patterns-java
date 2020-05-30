package com.estrutural.adapter;

// Adapter --> Adaptador --> O pattern propriamente dito
public class LogAdapter implements InterfaceLogger {

	private InterfaceloggerCustom loggerCustom;
	
	public LogAdapter(InterfaceloggerCustom loggerCustom) {
		this.loggerCustom = loggerCustom;
	}
	
	@Override
	public void log(String mensagem) {
		loggerCustom.logInfo(mensagem);		
	}

	@Override
	public void logError(Exception exception) {
		loggerCustom.logError(exception);		
	}
}
