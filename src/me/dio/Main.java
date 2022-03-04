package me.dio;

import me.dio.model.Endereco;

public class Main {
public static void main(String[] args) {
	Endereco endereco=new Endereco();
	endereco.setRua("osorio");
	
	System.out.println(endereco.getRua());
}
}
