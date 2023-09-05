package com.serratec.classes;

public class Telefone {
	
	private long idTelefone;
	private String telefone;
	
	public Telefone(long idTelefone, String telefone) {
		this.idTelefone = idTelefone;
		this.telefone = telefone;
	}


	/////////////////////////////////////////////////////////////////

public long getIdTelefone() {
		return idTelefone;
	}

	
protected void setIdTelefone(long idTelefone) {
		this.idTelefone = idTelefone;
	}

	
public String getTelefone() {
		return telefone;
	}

	
protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}