package factoryMethod;

//Concrete Creator
public class OracleFactory extends DbFactory {

	// Factory Method
	@Override
	public DbConnector createConnector(String connectionString) {
		return new OracleDbConnector(connectionString);
	}
}