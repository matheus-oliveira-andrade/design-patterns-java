package abstractFactory;

//Produto Concreto
public class GuinchoMedio extends Guincho {
	public GuinchoMedio(Porte porte) {
		super(porte);
	}

	@Override
	public void Socorrer(Veiculo veiculo) {
		// Processo de socorro
		System.out.println("Socorrendo Carro Medio - Modelo " + veiculo.getModelo());
	}
}
