package me.dio.model;

public abstract class 	FuncionarioCLT {

protected String nome;
protected String	documento;
protected Endereco	endereco;
protected Double	valorSalario;

public FuncionarioCLT() {
}

public FuncionarioCLT(String nome, String documento, double salario,Endereco endereco) {
	this.nome = nome;
	this.documento = documento;
	this.endereco = endereco;
	this.valorSalario = salario;
}

public String getNome() {
	return nome;
}

public String getDocumento() {
	return documento;
}

public Endereco getEndereco() {
	return endereco;
}

public Double getValorSalario() {
	return valorSalario;
}

public void setNome(String nome) {
	this.nome = nome;
}

public void setDocumento(String documento) {
	this.documento = documento;
}

public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}

public void setValorSalario(Double valorSalario) {
	this.valorSalario = valorSalario;
}


	
	
}
