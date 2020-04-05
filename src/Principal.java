import java.util.Scanner;

import abstractFactory.ExecucaoAbstractFactory;

public class Principal {

	public static void main(String[] args) {

		while (true) {			

			System.out.println("---------------------- ");
			System.out.println("   ESCOLHA UM DESIGN   ");
			System.out.println("---------------------- ");
			System.out.println("Padrões Criacionais    ");
			System.out.println("---------------------- ");
			System.out.println("1 - Abstract Factory   ");
			System.out.println("2 - Factory Method     ");
			System.out.println("---------------------- ");
			System.out.println("Padrões Estruturais    ");
			System.out.println("---------------------- ");
			System.out.println("3 - Facade			   ");
			System.out.println("---------------------- ");
			System.out.println("Padrões Comportamentais");
			System.out.println("---------------------- ");
			System.out.println("4 - Iterator		   ");
			System.out.println("5 - Observer		   ");
			System.out.println("---------------------- ");
			System.out.println();
			System.out.print("Escolha: ");

			Scanner scanner = new Scanner(System.in);
			int escolha = Integer.parseInt(scanner.next());

			System.out.println();
			
			switch (escolha) {
			case 1:
				// Abstract factory
				ExecucaoAbstractFactory.Executar();				
				break;
			case 2:
				// 
				System.out.println(2);
				break;
			case 3:
				//
				System.out.println(3);
				break;
			case 4:
				//
				System.out.println(4);
				break;
			case 5:
				//
				System.out.println(5);
				break;				
			}	
			
			System.out.println();
		}
	}

}
