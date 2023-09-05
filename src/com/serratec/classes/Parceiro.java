package com.serratec.classes;

public abstract class Parceiro {
	
	protected String nome;
	protected String cpf_cnpj;
	
	protected Parceiro(String nome, String cpf_cnpj) {
		this.nome = nome;
		this.cpf_cnpj = cpf_cnpj;
	}
	
	/////////////////////////////////////////////////////////////////
	
public String getNome() {
		return nome;
	}
	
protected void setNome(String nome) {
		this.nome = nome;
	}
	
public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	
protected void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	
}