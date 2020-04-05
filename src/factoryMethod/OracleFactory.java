package factoryMethod;

public class OracleFactory extends DbFactory{
	
		@Override
        public DbConnector CreateConnector(String connectionString)
        {
            return new OracleDbConnector(connectionString);
        }    
}