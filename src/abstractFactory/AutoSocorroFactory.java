package abstractFactory;

public abstract class AutoSocorroFactory
{
    public abstract Guincho CriarGuincho() throws Exception;
    public abstract Veiculo CriarVeiculo(String modelo, Porte porte) throws Exception;
}
