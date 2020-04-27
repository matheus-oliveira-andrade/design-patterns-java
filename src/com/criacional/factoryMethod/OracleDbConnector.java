package com.criacional.factoryMethod;

public class OracleDbConnector extends DbConnector {

	public OracleDbConnector(String connectionString) {
		super(connectionString);
	}

	@Override
	public Connection connect() {
		System.out.println("Conectando ao banco Oracle...");
		return new Connection(getConnectionString());
	}

}
