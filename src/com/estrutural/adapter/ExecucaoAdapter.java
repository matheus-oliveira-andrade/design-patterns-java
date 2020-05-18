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
		 * Nível de utilização 4/5
		 * 
		 * Problema: Um sistema legado possui ao realizar uma transação uma estrutura de log, desejasse 
		 * atualizar está estrutura sem alterar o sistema especifico		 
		 * 
		 * Vantagens:
		 * 
		 * - SRP ou principio da responsabilidade única, o padrão separa a lógica da transação da lógica primaria
		 * - OCP ou principio do aberto/fechado, uma classe deve estar aberta para extensão e fechada para modificação. 
		 * é possível introduzir novos adaptadores sem quebrar o código já existente, requerendo apenas que classe implementado 
		 * a interfaceLogger
		 * 
		 * Desvantagens:
		 * 
		 * - Código mais complexo, pois todo novo adaptador implementado é necessario introduzir um novo conjunto de interfaces e classes
		 * */
		
		TransacaoService servicoPagamento = new TransacaoService(new Logger());
		servicoPagamento.realizarOperacao();
		
		TransacaoService servicoPagamento2 = new TransacaoService(new LogAdapter(new LoggerCustom()));
		servicoPagamento2.realizarOperacao();
	}
}