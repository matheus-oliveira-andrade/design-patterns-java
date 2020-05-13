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
		 * Nível de utilização 4/5
		 * 
		 * Problema: Quando se tem várias classes que instânciam a mesma classe várias vezes e não se quer
		 * manter esse padrão de instância, se essa classe não mantêm estado, ou seja ela apenas processa e 
		 * retorna um resultado, não alterando o estado do objeto, ou seja a classe é estática é uma situação 
		 * em que se pode utilizar o pattern singleton. 
		 * 
		 * Vantagem:
		 * Não ficar alocando memória e armazenando a instância da classe o tempo todo
		 * 
		 * Desvatagens:
		 *  - Tratamento especial para uso multithreaded, para que várias threads possam acessar a instância
		 *  - Inflinge o SRP - Princípio da Pesponsabilidade Única, pois 
		 *  - Dificulta testes unitários
		 *  		 
		 *  
		 * Questions:
		 * 	https://stackoverflow.com/questions/137975/what-is-so-bad-about-singletons
		 * 	https://stackoverflow.com/questions/33155928/does-singleton-violate-the-single-responsibility-principle
		 *  
		 *  - Viola o SRP pois ele mesmo controla a sua criação e seu ciclo de vida, torna o acesso "global" - code smell (um código que cheira mal)
		 *  
		 *  - Para pequenas aplicações funciona, para grande aplicações as dependencias que essa classe pode ter precisa ser melhor gerenciada,
		 *    utilização de DI - Injeção de dependência
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
		
		System.out.println("Comparando instâncias...");
		
		if(p1.equals(p2) && p2.equals(p3) && p3.equals(p4)) {
			System.out.println("\nInstâncias iguais");
		}
	}
}
