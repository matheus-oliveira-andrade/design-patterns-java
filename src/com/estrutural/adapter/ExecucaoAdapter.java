package com.estrutural.adapter;

// Client
public class ExecucaoAdapter {

	public static void executar() {
	
		System.out.println("+---------------------------------------------------------------+");
		System.out.println("|----------------------- Estrutural ----------------------------|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|------------------------- Adapter -----------------------------|");
		System.out.println("+---------------------------------------------------------------+");
		System.out.println();
		
		/*		 		 		 		 
		 * N�vel de utiliza��o 4/5 ou Medium high
		 * 
		 * Objetivo: Permitir que objetos com interfaces incompat�veis colaborarem entre si.
		 * 
		 * https://www.dofactory.com/images/diagrams/net/adapter.gif
		 * 
		 * Problema: Um sistema legado possui ao realizar uma "transa��o" uma estrutura de log, desejasse 
		 * atualizar est� estrutura para situa��es especificas disparando um log customizado, sem alterar o 
		 * sistema existente.		 
		 * 
		 * Solu��o: Utiliza��o do adapter. Permite que objetos com interfaces incompat�veis colaborem entre si
		 * Ex. Classica situa��o em que um servI�o retorna um XML e desejasse que retorne um JSON se monta um 
		 * adapter para que isso seja poss�vel 
		 *
		 * Vantagens:
		 * 
		 * - SRP ou principio da responsabilidade �nica, o padr�o separa a l�gica da transa��o da l�gica primaria
		 * - OCP ou principio do aberto/fechado, uma classe deve estar aberta para extens�o e fechada para modifi��o. 
		 * - � poss�vel introduzir novos adaptadores sem quebrar o c�digo j� existente, requerendo apenas que classe 
		 * implemente a interfaceLogger
		 * 
		 * Desvantagens:
		 * 
		 * - C�digo mais complexo, pois todo novo adaptador implementado � necessario introduzir um novo conjunto de interfaces e classes
		 * 
		 *  Client - quem vai utilizar
		 *  Target - determinida funcionalidade
		 *  Adaptee - Adapta��o quer utilizar essa no lugar do client -- S� que ela n�o possui as mesma interfaces que o client espera utilizar
		 *  Adapter - faz a substitui��o do target pelo adaptee para que o client possa utilizar
		 **/
		
		TransacaoService servicoPagamento = new TransacaoService(new Logger());
		servicoPagamento.realizarOperacao();
		
		TransacaoService servicoPagamento2 = new TransacaoService(new LogAdapter(new LoggerCustom()));
		servicoPagamento2.realizarOperacao();
	}
}