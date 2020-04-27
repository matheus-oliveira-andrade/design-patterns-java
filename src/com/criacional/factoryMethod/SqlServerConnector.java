package com.criacional.factoryMethod;

public class SqlServerConnector extends DbConnector {

	public SqlServerConnector(String connectionString) {
		super(connectionString);
	}

	@Override
	public Connection connect() {
		System.out.println("Conectando ao banco SQL Server...");
		return new Connection(getConnectionString());
	}
}
