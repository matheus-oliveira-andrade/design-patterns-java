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
		 * Vantagens:
		 * 
		 * - SRP ou principio da responsabilidade �nica, o padr�o separa a l�gica da transa��o da l�gica primaria
		 * - OCP ou principio do aberto/fechado, uma classe deve estar aberta para extens�o e fechada para modifica��o. 
		 * � poss�vel introduzir novos adaptadores sem quebrar o c�digo j� existente, requerendo apenas que classe implementado 
		 * a interfaceLogger
		 * 
		 * Desvantagens:
		 * 
		 * - C�digo mais complexo, pois todo novo adaptador implementado � necessario introduzir um novo conjunto de interfaces e classes
		 * */
		
		TransacaoService servicoPagamento = new TransacaoService(new Logger());
		servicoPagamento.realizarOperacao();
		
		TransacaoService servicoPagamento2 = new TransacaoService(new LogAdapter(new LoggerCustom()));
		servicoPagamento2.realizarOperacao();
	}
}