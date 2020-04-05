package abstractFactory;

public class VeiculoCreator {

	public static Veiculo Criar(String modelo, Porte porte) throws Exception {
		switch (porte) {
		case Pequeno:
			return new VeiculoPequeno(modelo, porte);
		case Medio:
			return new VeiculoMedio(modelo, porte);
		case Grande:
			return new VeiculoGrande(modelo, porte);
		default:
			throw new Exception("Porte de veiculo desconhecido.");
		}
	}
}
