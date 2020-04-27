package factoryMethod;

//Concrete Creator
public class SqlServerFactory extends DbFactory{

	// Factory Method
	@Override
	public DbConnector createConnector(String connectionString) {
		return new SqlServerConnector(connectionString);
	}
	
}