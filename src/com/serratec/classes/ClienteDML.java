package com.serratec.classes;

import com.serratec.conexao.Conexao;
import com.serratec.dao.ClienteDAO;

public class ClienteDML {

	public static void gravarCliente(Conexao con, String schema, Cliente c) {

		ClienteDAO cdao = new ClienteDAO(con, schema);
		
		cdao.incluirCliente(c);
	}
	
	public static void alterarCliente(Conexao con, String schema, Cliente c) {
		
		ClienteDAO cdao = new ClienteDAO(con, schema);
		
		cdao.alterarCliente(c);
	}
	
	public static void excluirCliente(Conexao con, String schema, Cliente c) {
		
		ClienteDAO cdao = new ClienteDAO(con, schema);
		
		cdao.excluirCliente(c);
	}
}
