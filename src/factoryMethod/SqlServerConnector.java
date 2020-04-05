package factoryMethod;

public class SqlServerConnector extends DbConnector {

	public SqlServerConnector(String connectionString) {
		super(connectionString);
	}

	@Override
	public Connection Connect() {
		System.out.println("Conectando ao banco SQL Server...");
		return new Connection(getConnectionString());
	}
}
