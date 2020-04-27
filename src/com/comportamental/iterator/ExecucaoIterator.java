package com.comportamental.iterator;

public class ExecucaoIterator {

	public static void executar() {
		
		System.out.println("+---------------------------------------------------------------+");
		System.out.println("|--------------------- Comportamental --------------------------|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|------------------------ Iterator -----------------------------|");		
		System.out.println("+---------------------------------------------------------------+");
		System.out.println();
		
		/*
		 * 
		 * O Iterator é um padrão de projeto comportamental que permite a você percorrer elementos de uma coleção sem 
		 * expor as representações dele (lista, pilha, árvore, etc.)
		 * 
		 * 
		 * Fornece uma maneira uniforme de acessar os diferentes tipo de coleções de objetos (ArrayList, HashTable).
		 * 		
		 * 
		 * */
		
		CollectionMusica musicas = new CollectionMusica();		
		Album album = new Album(musicas);		
		album.printMusicas();
	}
}
