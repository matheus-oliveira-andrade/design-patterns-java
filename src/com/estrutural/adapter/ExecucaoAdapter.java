package com.estrutural.adapter;

public class ExecucaoAdapter {

	public static void executar() {
	
		System.out.println("+---------------------------------------------------------------+");
		System.out.println("|----------------------- Estrutural ----------------------------|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|------------------------- Adapter -----------------------------|");
		System.out.println("+---------------------------------------------------------------+");
		System.out.println();
		
		/*
		 * https://www.dofactory.com/images/diagrams/net/adapter.gif
		 * 
		 * N�vel de utiliza��o 4/5
		 * 
		 * Problema: Um sistema legado possui ao realizar uma transa��o uma estrutura de log, desejasse 
		 * atualizar est� estrutura sem alterar o sistema especifico		 
		 * 
		 * */
		
		TransacaoService servicoPagamento = new TransacaoService(new Logger());
		servicoPagamento.realizarOperacao();
		
		TransacaoService servicoPagamento2 = new TransacaoService(new LogAdapter(new LoggerCustom()));
		servicoPagamento2.realizarOperacao();
	}
}