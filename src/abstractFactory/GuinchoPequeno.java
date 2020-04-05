package abstractFactory;

public class GuinchoPequeno extends Guincho {

	public GuinchoPequeno(Porte porte) {
		super(porte);
	}

	@Override
	public void Socorrer(Veiculo veiculo) {
		// Processo de socorro
		System.out.println("Socorrendo Carro Pequeno - Modelo " + veiculo.getModelo());
	}

}
