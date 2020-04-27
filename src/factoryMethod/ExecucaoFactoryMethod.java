package factoryMethod;

public class ExecucaoFactoryMethod {

	public static void executar() {

		try {
			
			/*
			 * 
			 * Definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar. 
			 * O Factory Method permite adiar a instanciação para subclasse
			 * 	
			 * https://www.dofactory.com/images/diagrams/net/factory.gif
			 * 		 
			 */

			// Get factory do banco passado por parametro
			DbFactory dbFactoryMySql = DbFactory.database(DataBase.MySql);
			
			// retorna uma instancia do connector MySql
			DbConnector dbConnectorMySql = dbFactoryMySql.createConnector("minhaCS");
			
			// Abre conexão com o banco
			Connection mySqlCn = dbConnectorMySql.connect();
			mySqlCn.open();
			mySqlCn.executeCommand("select * from tabelaMySql");
			mySqlCn.close();

			System.out.println("");
			System.out.println("--------------------------------");
			System.out.println("");

			Connection oracleCn = DbFactory.database(DataBase.Oracle).createConnector("minhaCS").connect();
			oracleCn.open();
			oracleCn.executeCommand("select * from tabelaOracle");
			oracleCn.close();

			System.out.println("");
			System.out.println("--------------------------------");
			System.out.println("");

			Connection sqlServerCn = DbFactory.database(DataBase.SqlServer).createConnector("MinhaCS").connect();
			sqlServerCn.open();
			sqlServerCn.executeCommand("select * from tabelaSqlServer");
			sqlServerCn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
