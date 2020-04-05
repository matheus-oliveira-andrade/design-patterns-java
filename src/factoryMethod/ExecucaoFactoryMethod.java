package factoryMethod;

public class ExecucaoFactoryMethod {

	public static void Executar() {

		try {

			// Get factory do banco passado por parametro
			DbFactory dbFactoryMySql = DbFactory.Database(DataBase.MySql);
			
			// retorna uma instancia do connector MySql
			DbConnector dbConnectorMySql = dbFactoryMySql.CreateConnector("minhaCS");
			
			// Abre conexão com o banco
			Connection mySqlCn = dbConnectorMySql.Connect();
			mySqlCn.Open();
			mySqlCn.ExecuteCommand("select * from tabelaMySql");
			mySqlCn.Close();

			System.out.println("");
			System.out.println("--------------------------------");
			System.out.println("");

			Connection oracleCn = DbFactory.Database(DataBase.Oracle).CreateConnector("minhaCS").Connect();
			oracleCn.Open();
			oracleCn.ExecuteCommand("select * from tabelaOracle");
			oracleCn.Close();

			System.out.println("");
			System.out.println("--------------------------------");
			System.out.println("");

			Connection sqlServerCn = DbFactory.Database(DataBase.SqlServer).CreateConnector("MinhaCS").Connect();
			sqlServerCn.Open();
			sqlServerCn.ExecuteCommand("select * from tabelaSqlServer");
			sqlServerCn.Close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
