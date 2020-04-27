package observer;

import java.util.ArrayList;

public abstract class Investimento {
	private float valor;
	private ArrayList<Observador> observadores;
	private String simbolo;	

	protected Investimento(String simbolo, float valor) {
		this.simbolo = simbolo;
		this.valor = valor;
		
		observadores = new ArrayList<Observador>();
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		if (this.valor == valor)
			return;

		this.valor = valor;
		notificar();
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void subscribe(Observador observador) {
		observadores.add(observador);
		System.out.println("Notificando que " + observador.getNome() + " está recebendo atualizãções de " + simbolo);
	}

	public void unSubscribe(Observador observador) {
		observadores.remove(observador);
		System.out.println("Notificando que " + observador.getNome() + "NÃO está recebendo atualizãções de " + simbolo);
	}

	private void notificar()
    {
        for (Observador investidor : observadores)
        {
        	investidor.notificar(this);
        }

        System.out.println("");
    }

}
