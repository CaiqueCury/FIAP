package br.fiap.contato;

public class Contato {
	private String nome, email, endereco, nacimento;

	public Contato(String nome, String email, String endereco, String nacimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.nacimento = nacimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNacimento() {
		return nacimento;
	}

	public void setNacimento(String nacimento) {
		this.nacimento = nacimento;
	}
	
	
	
}
