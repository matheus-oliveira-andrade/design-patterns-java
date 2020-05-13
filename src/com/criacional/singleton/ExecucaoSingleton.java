package com.criacional.singleton;

public class ExecucaoSingleton {        
	
	public static void executar() {
		System.out.println("+---------------------------------------------------------------+");
		System.out.println("|--------------------- Comportamental --------------------------|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|------------------------ Singleton ----------------------------|");
		System.out.println("+---------------------------------------------------------------+");
		System.out.println();
		
		/*
		 * https://www.dofactory.com/images/diagrams/net/singleton.gif
		 * 
		 * N�vel de utiliza��o 4/5
		 * 
		 * Problema: Quando se tem v�rias classes que inst�nciam a mesma classe v�rias vezes e n�o se quer
		 * manter esse padr�o de inst�ncia, se essa classe n�o mant�m estado, ou seja ela apenas processa e 
		 * retorna um resultado, n�o alterando o estado do objeto, ou seja a classe � est�tica � uma situa��o 
		 * em que se pode utilizar o pattern singleton. 
		 * 
		 * Vantagem:
		 * N�o ficar alocando mem�ria e armazenando a inst�ncia da classe o tempo todo
		 * 
		 * Desvatagens:
		 *  - Tratamento especial para uso multithreaded, para que v�rias threads possam acessar a inst�ncia
		 *  - Inflinge o SRP - Princ�pio da Pesponsabilidade �nica, pois 
		 *  - Dificulta testes unit�rios
		 *  		 
		 *  
		 * Questions:
		 * 	https://stackoverflow.com/questions/137975/what-is-so-bad-about-singletons
		 * 	https://stackoverflow.com/questions/33155928/does-singleton-violate-the-single-responsibility-principle
		 *  
		 *  - Viola o SRP pois ele mesmo controla a sua cria��o e seu ciclo de vida, torna o acesso "global" - code smell (um c�digo que cheira mal)
		 *  
		 *  - Para pequenas aplica��es funciona, para grande aplica��es as dependencias que essa classe pode ter precisa ser melhor gerenciada,
		 *    utiliza��o de DI - Inje��o de depend�ncia
		 *    
		 *    
		 *    C#: .net core (nativo), simple injector  
		 *    Java: spring framework, google guice		 
		 *  
		 * */
		
		System.out.println("Criando presidente 1...");
		Presidente p1 = Presidente.getInstance();
		
		System.out.println("Criando presidente 2...");
		Presidente p2 = Presidente.getInstance();
		
		System.out.println("Criando presidente 3...");
		Presidente p3 = Presidente.getInstance();
		
		System.out.println("Criando presidente 4...");
		Presidente p4 = Presidente.getInstance();
		
		System.out.println("Comparando inst�ncias...");
		
		if(p1.equals(p2) && p2.equals(p3) && p3.equals(p4)) {
			System.out.println("\nInst�ncias iguais");
		}
	}
}
