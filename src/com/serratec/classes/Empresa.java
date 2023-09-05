package com.serratec.classes;

import java.util.List;

public class Empresa extends Parceiro{
	
	private long idEmpresa;
	private List<Telefone> telefones;
	private List<Email> emails;
	private List<Endereco> enderecos;
	
	public Empresa(String nome, String cpf_cnpj,
			long idEmpresa, List<Telefone> telefones, List<Email> emails,
			List<Endereco> enderecos) {
		super(nome, cpf_cnpj);
		this.idEmpresa = idEmpresa;
		this.telefones = telefones;
		this.emails = emails;
		this.enderecos = enderecos;
	}

	
	/////////////////////////////////////////////////////////////////
	
public long getIdEmpresa() {
		return idEmpresa;
	}

	
protected void setIdEmpresa(long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	
public List<Telefone> getTelefones() {
		return telefones;
	}

	
protected void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	
public List<Email> getEmails() {
		return emails;
	}

	
protected void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	
public List<Endereco> getEnderecos() {
		return enderecos;
	}

	
protected void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
}
