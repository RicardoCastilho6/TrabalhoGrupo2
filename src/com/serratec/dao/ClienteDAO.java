package com.serratec.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.serratec.classes.Cliente;
import com.serratec.conexao.Conexao;

public class ClienteDAO {
	private Conexao conexao;
	private String schema;
	
	PreparedStatement pInclusao;
	PreparedStatement pAlteracao;
	PreparedStatement pExclusao;
	
	public ClienteDAO(Conexao conexao, String schema) { 
		this.conexao = conexao;
		this.schema = schema;
		prepararSqlInclusao();
		prepararSqlAlteracao();
		prepararSqlExclusao();
	}
	
	private void prepararSqlExclusao() {
		String sql = "delete from "+ this.schema + ".cliente";
		sql += " where idcliente = ?";
		
		try {
			this.pExclusao = conexao.getC().prepareStatement(sql);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	private void prepararSqlInclusao() {
		String sql = "insert into "+ this.schema + ".cliente";	
		sql += " (nome, cpf, endereco, dtnasc, rg, sexo)";
		sql += " values ";
		sql += " (?, ?, ?, ?, ?, ?)";
		
		try {
			this.pInclusao =  conexao.getC().prepareStatement(sql);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	private void prepararSqlAlteracao() {
		String sql = "update "+ this.schema + ".cliente";	
		sql += " set nome = ?,";
		sql += " cpf = ?,";
		sql += " endereco = ?,";
		sql += " rg = ?,";
		sql += " dtnasc = ?,";
		sql += " sexo = ?";
		sql += " where idcliente = ?";
		
		try {
			this.pAlteracao =  conexao.getC().prepareStatement(sql);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	public int alterarCliente(Cliente cliente) {
		try {
			pAlteracao.setString(1, cliente.getNome());
			pAlteracao.setString(2, cliente.getCpf());
			pAlteracao.setString(3, cliente.getEndereco());
			pAlteracao.setString(4, cliente.getRg());
			pAlteracao.setDate(5, Date.valueOf(cliente.getDtNascimento()));
			pAlteracao.setString(6, String.valueOf(cliente.getSexo()));
			pAlteracao.setInt(7, cliente.getIdCliente());
			
			return pAlteracao.executeUpdate();
		} catch (Exception e) {
			if (e.getLocalizedMessage().contains("is null")) {
				System.err.println("\nCliente nao alterado.\nVerifique se foi chamado o conect:\n" + e);				
			} else {				
				System.err.println(e);
				e.printStackTrace();
			}
			return 0;
		}
	}
	
	public int incluirCliente(Cliente cliente) {
		try {		
							
			pInclusao.setString(1, cliente.getNome());
			pInclusao.setString(2, cliente.getCpf());
			pInclusao.setString(3, cliente.getEndereco());
			pInclusao.setDate(4, Date.valueOf(cliente.getDtNascimento()));
			pInclusao.setString(5, cliente.getRg());
			pInclusao.setString(6, String.valueOf(cliente.getSexo()));
			
			return pInclusao.executeUpdate();
		} catch (Exception e) {
			if (e.getLocalizedMessage().contains("is null")) {
				System.err.println("\nCliente nao incluido.\nVerifique se foi chamado o conect:\n" + e);				
			} else {				
				System.err.println(e);
				e.printStackTrace();
			}
			return 0;
		}
	}
	
	public int excluirCliente(Cliente cliente) {
		try {
			pExclusao.setInt(1, cliente.getIdCliente());
			
			return pExclusao.executeUpdate();
		} catch  (Exception e) {
			if (e.getLocalizedMessage().contains("is null")) {
				System.err.println("\nCliente nao incluido.\nVerifique se foi chamado o conect:\n" + e);				
			} else {				
				System.err.println(e);
				e.printStackTrace();
			}
			return 0;
		}
	}
	
	public ResultSet carregarClientes() {
		ResultSet tabela;				
		String sql = "select * from " + this.schema + ".cliente order by idcliente";
		
		tabela = conexao.query(sql);
			
		return tabela;
	}
}
