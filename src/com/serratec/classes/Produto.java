package com.serratec.classes;

public class Produto {	
	
	private long idProduto;
	private int cdProduto;
	private String nome;
	private String descricao;
	private Double valorUnit;
	private Double valorVenda;
	
	public Produto(long idProduto, int cdProduto,
		String nome, String descricao, Double valorUnit, Double valorVenda) {
		this.idProduto = idProduto;
		this.cdProduto = cdProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.valorUnit = valorUnit;
		this.valorVenda = valorVenda;
	}

	
	/////////////////////////////////////////////////////////////////
	
public long getIdProduto() {
		return idProduto;
	}


protected void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	
public int getCdProduto() {
		return cdProduto;
	}

	
protected void setCdProduto(int cdProduto) {
		this.cdProduto = cdProduto;
	}

	
public String getNome() {
		return nome;
	}

	
protected void setNome(String nome) {
		this.nome = nome;
	}

	
public String getDescricao() {
		return descricao;
	}

	
protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
public Double getValorUnit() {
		return valorUnit;
	}

	
protected void setValorUnit(Double valorUnit) {
		this.valorUnit = valorUnit;
	}

	
public Double getValorVenda() {
		return valorVenda;
	}

	
protected void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
}