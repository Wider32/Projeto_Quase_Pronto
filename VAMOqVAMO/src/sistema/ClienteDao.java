package sistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {

    public void cadastrar(Cliente objCliente) {
        Connection con = Conexao.obterConexao();
        String sql = "INSERT INTO cadastrousuario (nome, login, email, senha) VALUES(?, ?, ?, ?)";

        try (PreparedStatement preparador = con.prepareStatement(sql)) {
            preparador.setString(1, objCliente.getNome());
            preparador.setString(2, objCliente.getLogin());
            preparador.setString(3, objCliente.getEmail());
            preparador.setString(4, objCliente.getSenha());

            preparador.execute();

            System.out.println("Cliente cadastrado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> mostrarTodos() {
        Connection con = Conexao.obterConexao();
        List<Cliente> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM cadastrousuario";

        try (PreparedStatement preparador = con.prepareStatement(sql);
             ResultSet resultado = preparador.executeQuery()) {

            while (resultado.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodigo(resultado.getInt("codigo"));
                cliente.setNome(resultado.getString("nome"));
                cliente.setLogin(resultado.getString("login"));
                cliente.setEmail(resultado.getString("email"));
                cliente.setSenha(resultado.getString("senha"));

                usuarios.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
}