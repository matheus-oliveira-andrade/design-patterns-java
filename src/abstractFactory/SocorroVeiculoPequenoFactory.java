package abstractFactory;

//Concrete Factory
public class SocorroVeiculoPequenoFactory extends AutoSocorroFactory{

	 @Override
	 public Guincho CriarGuincho() throws Exception
     {
         return GuinchoCreator.Criar(Porte.Pequeno);
     }
	
	 @Override
     public Veiculo CriarVeiculo(String modelo, Porte porte) throws Exception
     {
         return VeiculoCreator.Criar(modelo, porte);
     }
}
