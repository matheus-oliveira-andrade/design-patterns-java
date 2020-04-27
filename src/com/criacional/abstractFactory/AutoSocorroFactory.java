package com.criacional.abstractFactory;

//Abstract Factory
public abstract class AutoSocorroFactory
{
    public abstract Guincho criarGuincho() throws Exception;
    public abstract Veiculo criarVeiculo(String modelo, Porte porte) throws Exception;
}
