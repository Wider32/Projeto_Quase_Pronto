package sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection obterConexao() {
		
		Connection con = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/simplicafisco","root","admin");
			System.out.println("Banco de Dados Conectado com Sucesso!!!!");
		
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Não foi possível conectar ao banco de dados!!!");
			e.printStackTrace();
		}
		
		return con;
	}

}