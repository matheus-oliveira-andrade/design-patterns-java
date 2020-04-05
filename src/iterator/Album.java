package iterator;

import java.util.Iterator;

public class Album {

	private CollectionMusica musicas;

	public Album(CollectionMusica musicas) {

		this.musicas = musicas;
	}

	public void PrintMusicas() {
		Iterator iterator = musicas.createIterator();

		System.out.println("Músicas...\n");

		while (iterator.hasNext()) {

			Musica musica = (Musica) iterator.next();

			System.out.println(musica.toString());
		}
	}
}
