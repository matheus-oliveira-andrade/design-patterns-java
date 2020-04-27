package com.criacional.abstractFactory;

// Cliente
public class AutoSocorro {

	private Veiculo _veiculo;
    private Guincho _guincho;

    public AutoSocorro(AutoSocorroFactory factory, Veiculo veiculo) throws Exception
    {
        _veiculo = factory.criarVeiculo(veiculo.getModelo(), veiculo.getPorte());
        _guincho = factory.criarGuincho();
    }

    public void RealizarAtendimento()
    {
        _guincho.socorrer(_veiculo);
    }

    public static AutoSocorro criarAutoSocorro(Veiculo veiculo) throws Exception
    {
        switch (veiculo.getPorte())
        {
            case Pequeno:
                return new AutoSocorro(new SocorroVeiculoPequenoFactory(), veiculo);
            case Medio:
                return new AutoSocorro(new SocorroVeiculoMedioFactory(), veiculo);
            case Grande:
                return new AutoSocorro(new SocorroVeiculoGrandeFactory(), veiculo);
            default:
                throw new Exception("Não foi possível identificar o veículo");
        }
    }
	
}
