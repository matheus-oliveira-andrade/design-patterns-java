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
		Notificar();
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void Subscribe(Observador observador) {
		observadores.add(observador);
		System.out.println("Notificando que " + observador.getNome() + " está recebendo atualizãções de " + simbolo);
	}

	public void UnSubscribe(Observador observador) {
		observadores.remove(observador);
		System.out.println("Notificando que " + observador.getNome() + "NÃO está recebendo atualizãções de " + simbolo);
	}

	private void Notificar()
    {
        for (Observador investidor : observadores)
        {
        	investidor.Notificar(this);
        }

        System.out.println("");
    }

}
