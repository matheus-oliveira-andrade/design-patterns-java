package com.estrutural.facade;

public class BancoContaFacade {

	private int numeroConta;
	private int codigoSeguranca;

	private NumeroContaCheck contaCheck;
	private CodigoSegurancaCheck codSegurancaCheck;
	private FundosCheck fundosCheck;
	private BemVindoBanco bemVindoBanco;

	public BancoContaFacade(int numConta, int codSeguranca) {

		numeroConta = numConta;
		codigoSeguranca = codSeguranca;

		bemVindoBanco = new BemVindoBanco();
		contaCheck = new NumeroContaCheck();
		codSegurancaCheck = new CodigoSegurancaCheck();
		fundosCheck = new FundosCheck();
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public int getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void sacarDinheiro(double valor) {

		if (contaCheck.isValidNumeroConta(getNumeroConta())
				&& codSegurancaCheck.isValidCodigoSeguranca(getCodigoSeguranca())
				&& fundosCheck.saqueEPossivel(valor)) {
			System.out.println("Transação completa\n");
		} else {
			System.out.println("Falha na transação\n");
		}
	}

	public void depositarDinheiro(double valor) {

		if (contaCheck.isValidNumeroConta(getNumeroConta())
				&& codSegurancaCheck.isValidCodigoSeguranca(getCodigoSeguranca())) {

			fundosCheck.fazerDeposito(valor);

			System.out.println("Transação completa\n");
		} else {
			System.out.println("Falha na transação\n");
		}

	}
}
