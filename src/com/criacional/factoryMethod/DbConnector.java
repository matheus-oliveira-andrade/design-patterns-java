package com.criacional.factoryMethod;

//Abstract Produto
public abstract class DbConnector {

	private String connectionString;

	protected DbConnector(String connectionString) {
		this.connectionString = connectionString;
	}

	public abstract Connection connect();

	protected String getConnectionString() {
		return connectionString;
	}

	protected void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
}