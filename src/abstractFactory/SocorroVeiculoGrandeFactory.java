package abstractFactory;

public class SocorroVeiculoGrandeFactory extends AutoSocorroFactory {

	@Override
	public Guincho CriarGuincho() throws Exception {
		return GuinchoCreator.Criar(Porte.Grande);
	}

	@Override
	public Veiculo CriarVeiculo(String modelo, Porte porte) throws Exception {
		return VeiculoCreator.Criar(modelo, porte);
	}

}
