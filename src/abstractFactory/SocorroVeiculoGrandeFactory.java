package abstractFactory;

//Concrete Factory
public class SocorroVeiculoGrandeFactory extends AutoSocorroFactory {

	@Override
	public Guincho criarGuincho() throws Exception {
		return GuinchoCreator.criar(Porte.Grande);
	}

	@Override
	public Veiculo criarVeiculo(String modelo, Porte porte) throws Exception {
		return VeiculoCreator.Criar(modelo, porte);
	}

}
