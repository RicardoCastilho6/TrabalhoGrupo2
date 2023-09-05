package com.serratec.classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import com.serratec.conexao.Conexao;
import com.serratec.dao.ClienteDAO;

public class ListaCliente {

	private Conexao con;
	private String schema;
	
	ArrayList<Cliente> clientes = new ArrayList<>();
	
	public ListaCliente(Conexao con, String schema) {
		this.con = con;
		this.schema = schema;
		
		carregarListaClientes();
	}

	private Cliente dadosCliente(ResultSet tabela) { 
		Cliente c = new Cliente();
		String dtNasc; 
		
		try {
			dtNasc = tabela.getString("dtnasc");
			if (dtNasc != null)
			c.setDtNascimento(LocalDate.parse(dtNasc));
			c.setNome(tabela.getString("nome"));
			c.setEndereco(tabela.getString("endereco"));
			c.setCpf(tabela.getString("cpf"));			
			c.setRg(tabela.getString("rg"));
			c.setIdCliente(tabela.getInt("idcliente"));
			return (Cliente) c;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private void carregarListaClientes() {
		ClienteDAO cdao = new ClienteDAO(con, schema);
		
		ResultSet tabela = cdao.carregarClientes();
		this.clientes.clear();
		
		try {
			tabela.beforeFirst();
			
			while (tabela.next()) {							
				this.clientes.add(dadosCliente(tabela));				
			}
			
			tabela.close();
		
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
}
