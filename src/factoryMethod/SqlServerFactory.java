package factoryMethod;

public class SqlServerFactory extends DbFactory{

	@Override
	public DbConnector CreateConnector(String connectionString) {
		return new SqlServerConnector(connectionString);
	}
	
}