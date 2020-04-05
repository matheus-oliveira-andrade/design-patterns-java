package factoryMethod;

public class MySqlFactory extends DbFactory{

	@Override
	public DbConnector CreateConnector(String connectionString) {
		return new MySqlConnector(connectionString);		
	}	
}
