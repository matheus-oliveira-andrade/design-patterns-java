package com.estrutural.facade;

public class FundosCheck {

	private double dinheiroConta = 1000.00;

	public double getSaldo() {
		return dinheiroConta;
	}

	private void diminuirDinheiroConta(double valor) {
		dinheiroConta -= valor;
	}

	private void adicionarDinheiroConta(double valor) {
		dinheiroConta += valor;
	}

	public boolean saqueEPossivel(double valorSacar) {

		if (valorSacar > getSaldo()) {
			System.out.println("Erro: Você não possuí saldo suficiente para este saque!");

			System.out.println("Balanço atual: " + getSaldo());

			return false;
		} else {

			diminuirDinheiroConta(valorSacar);
			System.out.println("Saque completo: Balanço atual é " + getSaldo());

			return true;
		}
	}

	public void fazerDeposito(double valorDepositar) {
		
		adicionarDinheiroConta(valorDepositar);
		System.out.println("Deposit Complete: Current Balance é " + getSaldo());
	}
}
