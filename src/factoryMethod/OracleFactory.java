package factoryMethod;

//Concrete Creator
public class OracleFactory extends DbFactory {

	// Factory Method
	@Override
	public DbConnector CreateConnector(String connectionString) {
		return new OracleDbConnector(connectionString);
	}
}