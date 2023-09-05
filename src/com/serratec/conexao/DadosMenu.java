package com.serratec.conexao;

import com.serratec.classes.Cliente;
import com.serratec.classes.ClienteDML;
import com.serratec.constantes.Util;

public class DadosMenu {
	
	public static int menu() {
		
		Util.escrever(Util.LINHAD);
		Util.escrever(Util.CABECALHO);
		Util.escrever(Util.LINHAD);
		Util.br();
		Util.escrever("Menu Principal");
		Util.escrever(Util.LINHA);
		Util.escrever("1- Cadastrar");
		Util.escrever("2- Alterar");
		Util.escrever("3- Excluir");
		Util.escrever("4- Listar");
		Util.escrever("5- Sair");
		Util.escrever(Util.LINHA);
		
		return Util.validarInteiro("Informe uma opcao: ");
	}

	public static int opcoes(int opcao) {
		
		switch (opcao) {
		case 1: cadastrar(); break;
		case 2: alterar(); break;
		case 3: excluir(); break;
		case 4: listar(); break;
		case 5: Util.escrever("Sistema Finalizado!"); break;
		default: Util.escrever("Opcao invalida");
		}
		return opcao;
	}
	
	public static void cadastrar() {
		
		ClienteDML.gravarCliente(Connect.getCon(), Connect.getSchema(), Cliente.cadastrarCliente());
	}

	public static void alterar() {
		
	}

	public static void excluir() {
		
	}

	public static void listar() {
		
	}

}
