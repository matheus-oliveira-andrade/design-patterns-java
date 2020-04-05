package abstractFactory;

import java.util.ArrayList;

public class ExecucaoAbstractFactory {

	public static void Executar() {
		try {

			// Cria os veiculos
			ArrayList<Veiculo> veiculosSocorro = new ArrayList<Veiculo>();
			veiculosSocorro.add(VeiculoCreator.Criar("Uno sem escada", Porte.Pequeno));
			veiculosSocorro.add(VeiculoCreator.Criar("Marea", Porte.Medio));
			veiculosSocorro.add(VeiculoCreator.Criar("BMW X6", Porte.Grande));

			// Percorre cada veiculo
			for (Veiculo veiculo : veiculosSocorro) {

				// Para cada veiculo cria o guincho especifico e retorna uma instancia de
				// autoSocorro
				AutoSocorro autoSocorro = AutoSocorro.CriarAutoSocorro(veiculo);

				// Realiza o atendimento do veiculo
				autoSocorro.RealizarAtendimento();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
