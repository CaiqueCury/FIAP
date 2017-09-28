package br.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fiap.contato.Contato;
import br.fiap.dao.ContatoDAO;


@WebServlet("/adicionaContato")//realiza o link com o formulario

public class AdicionarContato extends HttpServlet { //Extende HttpServlet do pacote javax
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// NÃO USAR  SUPER CLASSE -> super.service(arg0, arg1);
		// Vem pelo request e devolve pelo response
		String nome = request.getParameter("nome"); //pega do html o 'name'
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		String nascimento = request.getParameter("dataNascimento");
		new ContatoDAO().inserir(new Contato(nome, email, endereco, nascimento));
	}	
}
