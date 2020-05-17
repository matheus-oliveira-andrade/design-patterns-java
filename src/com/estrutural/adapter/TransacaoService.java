package com.estrutural.adapter;

public class TransacaoService {

	private InterfaceLogger logger;

	public TransacaoService(InterfaceLogger logger) {
		this.logger = logger;
	}

	public void realizarOperacao() {				
		logger.log("Transa��o realizada com sucesso!");
	}
}
