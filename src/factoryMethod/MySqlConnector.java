package factoryMethod;

public class MySqlConnector extends DbConnector {

	public MySqlConnector(String connectionString) {
		super(connectionString);
	}

	@Override
	public Connection Connect() {
		System.out.println("Conectando ao banco My Sql...");
		return new Connection(getConnectionString());
	}
}
