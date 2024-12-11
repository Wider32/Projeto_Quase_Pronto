package SistemaNotas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sistema.Conexao;

public class NotaPedidoDao {

    public void cadastrar(NotaPedido notaPedido) {
        Connection con = Conexao.obterConexao();
        String sql = "INSERT INTO cadastronota (id_nota, id_pedido, estado, NumeroNotaFiscal, fornecedor, itens, dia) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparador = con.prepareStatement(sql)) {
            preparador.setInt(1, notaPedido.getIdNota());
            preparador.setInt(2, notaPedido.getIdPedido());
            preparador.setString(3, notaPedido.getEstado());
            preparador.setString(4, notaPedido.getNumeroNotaFiscal());
            preparador.setString(5, notaPedido.getFornecedor());
            preparador.setString(6, notaPedido.getItens());
            preparador.setDate(7, notaPedido.getDia());

            preparador.execute();

            System.out.println("Nota cadastrada com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<NotaPedido> mostrarTodas() {
        Connection con = Conexao.obterConexao();
        List<NotaPedido> notas = new ArrayList<>();
        String sql = "SELECT * FROM cadastronota";

        try (PreparedStatement preparador = con.prepareStatement(sql);
             ResultSet resultado = preparador.executeQuery()) {

            while (resultado.next()) {
                NotaPedido notaPedido = new NotaPedido();
                notaPedido.setIdNota(resultado.getInt("id_nota"));
                notaPedido.setIdPedido(resultado.getInt("id_pedido"));
                notaPedido.setEstado(resultado.getString("estado"));
                notaPedido.setNumeroNotaFiscal(resultado.getString("NumeroNotaFiscal"));
                notaPedido.setFornecedor(resultado.getString("fornecedor"));
                notaPedido.setItens(resultado.getString("itens"));
                notaPedido.setDia(resultado.getDate("dia"));

                notas.add(notaPedido);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return notas;
    }
}