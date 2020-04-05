package factoryMethod;

//Abstract Creator
public abstract class DbFactory {

	// Factory Method
	public abstract DbConnector CreateConnector(String connectionString);

	public static DbFactory Database(DataBase dataBase) throws Exception {

		switch (dataBase) {
		case SqlServer:
			return new SqlServerFactory();
		case MySql:
			return new MySqlFactory();
		case Oracle:
			return new OracleFactory();
		default:
			throw new Exception("Banco de dados não reconhecido.");
		}
	}
}
