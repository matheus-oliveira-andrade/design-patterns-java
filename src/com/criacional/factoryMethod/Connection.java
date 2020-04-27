package com.criacional.factoryMethod;

public class Connection {

	private String connectionString;    
	private boolean opened;

    public Connection(String connectionString)
    {
        this.connectionString = connectionString;
    }

    public void executeCommand(String command)
    {
        System.out.println("Executando Commando: " + command);
    }

    public void open()
    {
        opened = true;
        System.out.println("Conexão aberta");
    }

    public void close()
    {
        System.out.println("Conexão fechada");
    }
	
    public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public boolean isOpened() {
		return opened;
	}
}
