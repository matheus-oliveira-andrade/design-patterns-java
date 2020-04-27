package com.comportamental.observer;

import java.util.Random;

public class ExecucaoObserver {

	public static void executar() {

		System.out.println("+---------------------------------------------------------------+");
		System.out.println("|--------------------- Comportamental --------------------------|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|------------------------ Observer -----------------------------|");
		System.out.println("+---------------------------------------------------------------+");
		System.out.println();
		
		/*
		 * 
		 * Defina uma dependência de um para muitos entre objetos para que, quando um objeto mudar de estado,
		 * todos os seus dependentes sejam notificados e atualizados automaticamente.
		 * 
		 * https://www.dofactory.com/images/diagrams/net/observer.gif
		 * 
		 * */
		
		Observador joao = new Observador("João");
		Observador eduardo = new Observador("Eduardo");
		Observador bill = new Observador("Bill");

		PapelBovespa amazon = new PapelBovespa("Amazon", nextFloat());
		PapelBovespa microsoft = new PapelBovespa("Microsoft", nextFloat());

		amazon.subscribe(joao);
		amazon.subscribe(eduardo);

		microsoft.subscribe(eduardo);
		microsoft.subscribe(bill);

		System.out.println("");
		System.out.println("------------------");
		System.out.println("");

		for (int i = 0; i < 5; i++) {
			amazon.setValor(nextFloat());
			microsoft.setValor(nextFloat());

			if (i == 1) {
				amazon.unSubscribe(eduardo);
			}
		}

	}

	private static float nextFloat() {
		Random random = new Random();
		float r = random.nextFloat();
		return r / (float) 100000.00;
	}

}
