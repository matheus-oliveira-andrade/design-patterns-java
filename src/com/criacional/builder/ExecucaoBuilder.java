package com.criacional.builder;

public class ExecucaoBuilder {

	public static void executar() {

		// Builder
		// https://stackoverflow.com/questions/328496
		// https://github.com/kamranahmedse/design-patterns-for-humans#-builder
		// Example: HTML, Computer
		/*
		 * O padrão do construtor é um padrão de design de software de criação de objeto com a intenção de encontrar uma 
		 * solução para o antipadrão do construtor telescópico.
		 * 
		 * https://upload.wikimedia.org/wikipedia/commons/f/f3/Builder_UML_class_diagram.svg
		 * 
		 * https://refactoring.guru/images/patterns/diagrams/builder/example-en.png
		 * 
		 * Pode ser utilizada com um director ou não
		 *  
		 * */		
		
		System.out.println("+---------------------------------------------------------------+");
		System.out.println("|----------------------- Criacional ----------------------------|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|------------------------- Builder -----------------------------|");
		System.out.println("+---------------------------------------------------------------+");
		System.out.println();			
		
		Computador computador = new Computador(new ComputadorBuilder("placa mãe xyz", "processador xyz", "memoria ram xyz 8gb", "fonte modular xyz", "hd xyz 500gb")
							.addGabinete("Gabinete xyz 4 baias hd")
							.addPlacaVideo("Placa de vídeo XYZ")
							.addSsd("ssd xyz 120gb"));
		
		System.out.println(computador.toString());
	}
}
