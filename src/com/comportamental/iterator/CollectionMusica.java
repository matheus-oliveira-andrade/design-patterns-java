package com.comportamental.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class CollectionMusica implements Collection {

	static final int MAX_ITEMS = 10;
	int numeroDeItems;
	Musica[] musicaList;

	public CollectionMusica() {

		musicaList = new Musica[MAX_ITEMS];

		adicionarItem(new Musica(2020, "Musica 1", "Cantor 1"));
		adicionarItem(new Musica(2020, "Musica 2", "Cantor 2"));
		adicionarItem(new Musica(2020, "Musica 3", "Cantor 3"));
		adicionarItem(new Musica(2020, "Musica 4", "Cantor 4"));
		adicionarItem(new Musica(2020, "Musica 5", "Cantor 5"));
		adicionarItem(new Musica(2020, "Musica 6", "Cantor 6"));
		adicionarItem(new Musica(2020, "Musica 7", "Cantor 7"));
		adicionarItem(new Musica(2020, "Musica 8", "Cantor 8"));
		adicionarItem(new Musica(2020, "Musica 9", "Cantor 9"));
		adicionarItem(new Musica(2020, "Musica 10", "Cantor 10"));
	}

	public void adicionarItem(Musica musica) {

		if (numeroDeItems >= MAX_ITEMS) {
			System.out.println("Lista cheia");
		} else {
			musicaList[numeroDeItems] = musica;
			numeroDeItems++;
		}
	}

	@Override
	public Iterator createIterator() {
		return Arrays.asList(musicaList).iterator();
	}

}
