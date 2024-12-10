package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sistema.Cliente;
import sistema.ClienteDao;

@WebServlet("/servlet")
public class ClienteServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("txtnome");
        String login = request.getParameter("txtlogin");
        String email = request.getParameter("txtemail");
        String senha = request.getParameter("txtsenha");
        
        Cliente objCliente = new Cliente(nome, login, email, senha);
        
        ClienteDao clienteDao = new ClienteDao();
        clienteDao.cadastrar(objCliente);
        
        response.sendRedirect("http://localhost:8080/******/cadastro.html");
    }
}