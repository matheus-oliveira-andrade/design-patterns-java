package observer;

public class Observador implements InterfaceObservador {

	private String nome;

	public Observador(String nome) {
		this.nome = nome;
	}

	public void Notificar(Investimento investimento) {
		System.out.println("Notificando " + nome + " que " + investimento.getSimbolo() + " teve preço alterado para "
				+ investimento.getValor());
	}

	@Override
	public String getNome() {
		return nome;
	}

}
