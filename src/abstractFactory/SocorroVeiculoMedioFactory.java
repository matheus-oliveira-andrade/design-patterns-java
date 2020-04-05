package abstractFactory;

//Concrete Factory
public class SocorroVeiculoMedioFactory extends AutoSocorroFactory {

	@Override
	public Guincho CriarGuincho() throws Exception {
		return GuinchoCreator.Criar(Porte.Medio);
	}

	@Override
	public Veiculo CriarVeiculo(String modelo, Porte porte) throws Exception {
		return VeiculoCreator.Criar(modelo, porte);
	}
}
