package com.criacional.factoryMethod;

public class MySqlConnector extends DbConnector {

	public MySqlConnector(String connectionString) {
		super(connectionString);
	}

	@Override
	public Connection connect() {
		System.out.println("Conectando ao banco My Sql...");
		return new Connection(getConnectionString());
	}
}
