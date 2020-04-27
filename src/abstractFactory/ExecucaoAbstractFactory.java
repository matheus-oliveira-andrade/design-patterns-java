package abstractFactory;

import java.util.ArrayList;

public class ExecucaoAbstractFactory {

	public static void executar() {
		try {

			/*
			 * 
			 * A intenção deste padrão é fornecer uma interface para criação de famílias de
			 * objeto relacionados ou dependentes sem especificar suas classes concretas. 
			 * Também é conhecido como KIT. Este padrão deve ser aplicado quando se deseja
			 * isolar a aplicação da implementação da classe concreta
			 * 			 
			 * https://www.dofactory.com/images/diagrams/net/abstract.gif
			 * 
			 */
			
			// Cria os veiculos
			ArrayList<Veiculo> veiculosSocorro = new ArrayList<Veiculo>();
			veiculosSocorro.add(VeiculoCreator.Criar("Uno sem escada", Porte.Pequeno));
			veiculosSocorro.add(VeiculoCreator.Criar("Marea", Porte.Medio));
			veiculosSocorro.add(VeiculoCreator.Criar("BMW X6", Porte.Grande));

			// Percorre cada veiculo
			for (Veiculo veiculo : veiculosSocorro) {

				// Para cada veiculo cria o guincho especifico e retorna uma instancia de
				// autoSocorro
				AutoSocorro autoSocorro = AutoSocorro.criarAutoSocorro(veiculo);

				// Realiza o atendimento do veiculo
				autoSocorro.RealizarAtendimento();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
