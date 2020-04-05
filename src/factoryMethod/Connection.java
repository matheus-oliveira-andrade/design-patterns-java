package factoryMethod;

public class Connection {

	private String connectionString;    
	private boolean opened;

    public Connection(String connectionString)
    {
        this.connectionString = connectionString;
    }

    public void ExecuteCommand(String command)
    {
        System.out.println("Executando Commando: " + command);
    }

    public void Open()
    {
        opened = true;
        System.out.println("Conexão aberta");
    }

    public void Close()
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
