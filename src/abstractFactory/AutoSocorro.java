package abstractFactory;

// Cliente
public class AutoSocorro {

	private Veiculo _veiculo;
    private Guincho _guincho;

    public AutoSocorro(AutoSocorroFactory factory, Veiculo veiculo) throws Exception
    {
        _veiculo = factory.CriarVeiculo(veiculo.getModelo(), veiculo.getPorte());
        _guincho = factory.CriarGuincho();
    }

    public void RealizarAtendimento()
    {
        _guincho.Socorrer(_veiculo);
    }

    public static AutoSocorro CriarAutoSocorro(Veiculo veiculo) throws Exception
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
