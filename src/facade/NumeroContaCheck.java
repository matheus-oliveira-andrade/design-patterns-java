package facade;

public class NumeroContaCheck {

	
	private int numeroConta = 123456;
	
	public int getnumeroConta() {
		return numeroConta;
	}
	
	public boolean isValidNumeroConta(int numeroConta) {		
		return this.numeroConta == numeroConta;		
	}
}
