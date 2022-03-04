package me.dio;

import me.dio.model.Endereco;
import me.dio.model.OperadorCaixa;
import me.dio.model.Vendedor;

public class Main {
public static void main(String[] args) {
	Endereco endereco=new Endereco();
	endereco.setRua("osorio");
	
	System.out.println(endereco.getRua());
	
	Vendedor vendedor=new Vendedor();
	vendedor.setNome("Anderson");
	vendedor.setValorSalario(2500d);
	System.out.println("---------------");
	
	
	OperadorCaixa operadorCaixa=
	new OperadorCaixa("Pedro", "123", 550d, "Osorio");
}
}
