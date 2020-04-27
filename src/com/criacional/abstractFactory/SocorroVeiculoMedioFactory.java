package com.criacional.abstractFactory;

//Concrete Factory
public class SocorroVeiculoMedioFactory extends AutoSocorroFactory {

	@Override
	public Guincho criarGuincho() throws Exception {
		return GuinchoCreator.criar(Porte.Medio);
	}

	@Override
	public Veiculo criarVeiculo(String modelo, Porte porte) throws Exception {
		return VeiculoCreator.Criar(modelo, porte);
	}
}
