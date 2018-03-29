package br.com.fiap.controller;

import javax.faces.bean.ManagedBean;

import br.com.fiap.DAO.CadastroDAO;
import br.com.fiap.model.Funcionario;

@ManagedBean
public class CadastroFuncionarioController {

	private Funcionario funcionario = new Funcionario();

	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	
	
	//prop de sainda
	private String erro = "";
		
	public String getErro () {
		return erro;
	}
	
 
	


	public String cadastrar() {
		erro = "";
		if(funcionario.getCpf().isEmpty()) {
			erro += "CPF obrigatório";
		}
		if (funcionario.getNome().isEmpty()) {
			erro += " \nNome obrigatório";
		}
		if (funcionario.getSalario() <= 1000) {
			erro += " \nSalario deve ser maior que 1000";
		}
		if(erro.isEmpty()) {
			CadastroDAO dao = new CadastroDAO();
			dao.cadastrarFunc(funcionario);			
			return "sucesso";
		}
		
		return "erro";
	}
	
	public String pesquisar() {
		erro = "";
		CadastroDAO dao = new CadastroDAO();
		funcionario = dao.pesquisarFunc(funcionario.getCpf());
		if (funcionario != null) {
			return "visualizar";
		}
		erro += "Funcionario não encontrado";
		return "erro";
	}
	
	
	
	
	
	public String irParaCadastrar() {
		return "cadastrar";
	}
	public String irParaPesquisar() {
		return "pesquisar";
	}
	public String irParaMenu() {
		return "menu";
	}
	
}
