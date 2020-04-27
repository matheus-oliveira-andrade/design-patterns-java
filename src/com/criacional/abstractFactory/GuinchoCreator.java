package com.criacional.abstractFactory;


public class GuinchoCreator {

	public static Guincho criar(Porte porte) throws Exception
    {
        switch (porte)
        {
            case Pequeno:
                return new GuinchoPequeno(porte);
            case Medio:
                return new GuinchoMedio(porte);
            case Grande:
                return new GuinchoGrande(porte);
            default:
                throw new Exception("Porte de Guincho desconhecido.");
        }
    }
	
}
