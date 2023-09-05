package com.serratec.classes;

public class Endereco {
	
	private long idEndereco;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String uf;
	
	public Endereco(long idEndereco, String logradouro,
			String numero, String bairro, String cidade, String uf) {
		this.idEndereco = idEndereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}

	
	/////////////////////////////////////////////////////////////////
	
public long getIdEndereco() {
		return idEndereco;
	}

	
protected void setIdEndereco(long idEndereco) {
		this.idEndereco = idEndereco;
	}

	
public String getLogradouro() {
		return logradouro;
	}

	
protected void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	
public String getNumero() {
		return numero;
	}

	
protected void setNumero(String numero) {
		this.numero = numero;
	}

	
public String getBairro() {
		return bairro;
	}

	
protected void setBairro(String bairro) {
		this.bairro = bairro;
	}

	
public String getCidade() {
		return cidade;
	}

	
protected void setCidade(String cidade) {
		this.cidade = cidade;
	}

	
public String getUf() {
		return uf;
	}

	
protected void setUf(String uf) {
		this.uf = uf;
	}

}
