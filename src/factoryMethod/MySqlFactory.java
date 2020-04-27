package factoryMethod;

//Concrete Creator
public class MySqlFactory extends DbFactory{

	// Factory Method
	@Override
	public DbConnector createConnector(String connectionString) {
		return new MySqlConnector(connectionString);		
	}	
}
