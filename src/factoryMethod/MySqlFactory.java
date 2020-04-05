package factoryMethod;

//Concrete Creator
public class MySqlFactory extends DbFactory{

	// Factory Method
	@Override
	public DbConnector CreateConnector(String connectionString) {
		return new MySqlConnector(connectionString);		
	}	
}
