package me.dio.model;

public class Vendedor  extends FuncionarioCLT{
private Double valorBonificacao;
	
	
	
	@Override
	public String toString() {
		return "Vendedor [nome=" + nome + ","
	+ " documento=" + documento + ","
	+ " endereco=" + endereco + ", "
	+ "salario=" + salario
	+ "]";
	}
	
	
	
	
}
