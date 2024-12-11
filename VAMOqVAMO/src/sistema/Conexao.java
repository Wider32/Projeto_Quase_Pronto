package sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection obterConexao() {
		
		Connection con = null;
		
		try {
			
			
			// esqueci minha senha chutei a que talvez possa ser se n for essa é admin
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/simplicafisco","root","root");
			System.out.println("Adicionado com sucesso!!!");
		
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Não foi possivel adicionar pois Falhou com sucesso!!!");
			e.printStackTrace();
		}
		
		return con;
	}

}