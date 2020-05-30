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
		 * Nível de utilização 4/5 ou Medium high
		 * 
		 * Objetivo: Permitir que objetos com interfaces incompatíveis colaborarem entre si.
		 * 
		 * https://www.dofactory.com/images/diagrams/net/adapter.gif
		 * 
		 * Problema: Um sistema legado possui ao realizar uma "transação" uma estrutura de log, desejasse 
		 * atualizar está estrutura para situações especificas disparando um log customizado, sem alterar o 
		 * sistema existente.		 
		 * 
		 * Solução: Utilização do adapter. Permite que objetos com interfaces incompatíveis colaborem entre si
		 * Ex. Classica situação em que um servIço retorna um XML e desejasse que retorne um JSON se monta um 
		 * adapter para que isso seja possível 
		 *
		 * Vantagens:
		 * 
		 * - SRP ou principio da responsabilidade única, o padrão separa a lógica da transação da lógica primaria
		 * - OCP ou principio do aberto/fechado, uma classe deve estar aberta para extensão e fechada para modifição. 
		 * - É possível introduzir novos adaptadores sem quebrar o código já existente, requerendo apenas que classe 
		 * implemente a interfaceLogger
		 * 
		 * Desvantagens:
		 * 
		 * - Código mais complexo, pois todo novo adaptador implementado é necessario introduzir um novo conjunto de interfaces e classes
		 * 
		 *  Client - quem vai utilizar
		 *  Target - determinida funcionalidade
		 *  Adaptee - Adaptação quer utilizar essa no lugar do client -- Só que ela não possui as mesma interfaces que o client espera utilizar
		 *  Adapter - faz a substituição do target pelo adaptee para que o client possa utilizar
		 **/
		
		TransacaoService servicoPagamento = new TransacaoService(new Logger());
		servicoPagamento.realizarOperacao();
		
		TransacaoService servicoPagamento2 = new TransacaoService(new LogAdapter(new LoggerCustom()));
		servicoPagamento2.realizarOperacao();
	}
}