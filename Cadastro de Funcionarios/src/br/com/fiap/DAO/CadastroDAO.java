package br.com.fiap.DAO;

import java.util.ArrayList;

import br.com.fiap.model.Funcionario;

public class CadastroDAO {
	
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public void cadastrarFunc(Funcionario func) {
		funcionarios.add(func);
	}
	
	public Funcionario pesquisarFunc(String cpf) {
		Funcionario func = null;
		
		for(Funcionario funcionario: funcionarios) {
			if (funcionario.getCpf().equals(cpf)) {
				func = funcionario;
			}
		}
		
		return func;
	}
}
