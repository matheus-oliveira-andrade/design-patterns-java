import java.util.Scanner;

import com.comportamental.iterator.ExecucaoIterator;
import com.comportamental.observer.ExecucaoObserver;
import com.criacional.abstractFactory.ExecucaoAbstractFactory;
import com.criacional.factoryMethod.ExecucaoFactoryMethod;
import com.estrutural.facade.ExecucaoFacade;

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
				// Abstract Factory
				ExecucaoAbstractFactory.executar();				
				break;
			case 2:
				// Factory Method
				ExecucaoFactoryMethod.executar();
				break;
			case 3:
				// Facade
				ExecucaoFacade.executar();
				break;
			case 4:
				// Iterator
				ExecucaoIterator.executar();
				break;
			case 5:
				// Observer
				ExecucaoObserver.executar();
				break;				
			}	
			
			System.out.println();
		}
	}

}
