package iterator;

public class Musica {

	private int ano;
	private String nomeMusica;
	private String nomeCantor;

	public Musica(int ano, String nomeMusica, String nomeCantor) {
		this.ano = ano;
		this.nomeMusica = nomeMusica;
		this.nomeCantor = nomeCantor;
	}

	public int getAno() {
		return ano;
	}

	public String getNomeCantor() {
		return nomeCantor;
	}

	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public void setNomeCantor(String nomeCantor) {
		this.nomeCantor = nomeCantor;
	}

	@Override
	public String toString() {
		return "ano: " + ano + ", nomeMusica: " + nomeMusica + ", nomeCantor: " + nomeCantor;
	}
}
