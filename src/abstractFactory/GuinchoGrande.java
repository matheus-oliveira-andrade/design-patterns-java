package abstractFactory;

//Produto Concreto
public class GuinchoGrande extends Guincho {

	public GuinchoGrande(Porte porte) {
		super(porte);
	}

	@Override
	public void Socorrer(Veiculo veiculo) {
		// Processo de socorro
		System.out.println("Socorrendo Carro Grande - Modelo " + veiculo.getModelo());
	}

}
