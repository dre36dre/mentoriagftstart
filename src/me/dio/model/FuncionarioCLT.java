package me.dio.model;

public abstract class 	FuncionarioCLT {

protected String nome;
protected String	documento;
protected Endereco	endereco;
protected double	salario;


public FuncionarioCLT() {
}

public FuncionarioCLT(String nome, String documento, Endereco endereco, double salario) {
	this.nome = nome;
	this.documento = documento;
	this.endereco = endereco;
	this.salario = salario;
}


	
	
}
