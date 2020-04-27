package com.estrutural.facade;

public class ExecucaoFacade {	

	public static void executar() {
		
		System.out.println("+---------------------------------------------------------------+");
		System.out.println("+----------------------- Estrutural ----------------------------+");
		System.out.println("+---------------------------------------------------------------+");
		System.out.println("+------------------------- Facade ------------------------------+");
		System.out.println("+---------------------------------------------------------------+");
		System.out.println();
		
		/*
		 * Fornecer uma interface unificada para um conjunto de interfaces em um
		 * subsistema. Façade define uma interface de nível mais alto que torna o
		 * subsistema mais fácil de ser usado.
		 * 
		 * Objetivo tornar possível uma personalização, ou adapatação de trabalho da
		 * aplicação sem fugir muito da modelagem dos objetos
		 * 
		 * 
		 * Exemplos: Quando você liga para uma loja para fazer um pedido, um operador é
		 * sua fachada para todos os serviços e departamentos da loja. O operador
		 * fornece a você uma simples interface de voz para o sistema de pedido,
		 * pagamentos, e vários sistemas de entrega.
		 * 
		 * https://www.dofactory.com/images/diagrams/net/facade.gif
		 * 
		 */

		BancoContaFacade acessandoBanco = new BancoContaFacade(123456, 1234567);

		acessandoBanco.sacarDinheiro(50.00);

		acessandoBanco.sacarDinheiro(900.00);

		acessandoBanco.depositarDinheiro(200.00);
	}
}
