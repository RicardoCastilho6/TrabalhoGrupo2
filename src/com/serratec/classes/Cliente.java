/*
package com.serratec.classes;

import java.util.List;

public class Cliente extends Parceiro{
	
	private long idCliente;
	private List<Telefone> telefones;
	private List<Email> emails;
	private List<Endereco> enderecos;
	
	public Cliente(String nome, String cpf_cnpj, long idCliente, List<Telefone> telefones, List<Email> emails,
			List<Endereco> enderecos) {
		super(nome, cpf_cnpj);
		this.idCliente = idCliente;
		this.telefones = telefones;
		this.emails = emails;
		this.enderecos = enderecos;
	}

	
	/////////////////////////////////////////////////////////////////
	
public long getIdCliente() {
		return idCliente;
	}


protected void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
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
*/
package com.serratec.classes;

import java.util.Scanner;

import com.serratec.constantes.Util;

public class Cliente extends Pessoa {
	
	

	private int idCliente;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	@SuppressWarnings("resource")
	public static Cliente cadastrarCliente() {
		
		Cliente c = new Cliente();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(Util.LINHA);
		System.out.println("Cadastro de cliente: ");
		System.out.println(Util.LINHA);
		
		Util.br();
		
		System.out.println("Informe o nome: ");
		String s = in.nextLine();
		c.setNome(s);
	
		System.out.println("Informe o endereco: ");
		s = in.nextLine();
		c.setEndereco(s);
		
		c.setDtNascimento(Util.validarData("Informe a data de nascimento (dd/MM/yyyy): "));
		
		System.out.println("Informe o CPF: ");
		s = in.nextLine();
		c.setCpf(s);
		
		System.out.println("Informe o RG: ");
		s = in.nextLine();
		c.setRg(s);
		
		System.out.println("Informe o sexo: ");
		char ch = in.next().charAt(0);
		c.setSexo(ch);
		
		return c;
	}
	
}
