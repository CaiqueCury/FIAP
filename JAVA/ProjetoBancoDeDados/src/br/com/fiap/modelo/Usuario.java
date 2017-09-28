package br.com.fiap.modelo;

/**
 *
 * @author logonrm
 */
public class Usuario {
    private String cpf;
    private String nome;
    private String senha;
    private String login;

    public Usuario(String cpf, String nome, String senha, String login) {
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.login = login;
    }

    public Usuario(String senha, String login) {
        this.senha = senha;
        this.login = login;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getLogin() {
        return login;
    }
    
    
    
}
