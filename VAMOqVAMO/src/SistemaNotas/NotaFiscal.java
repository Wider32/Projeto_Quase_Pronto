package SistemaNotas;

import java.util.ArrayList;
import java.util.List;

import sistema.Cliente;

public class NotaFiscal {
    private Cliente cliente;
    private List<Produto> produtos;
    private double valorTotal;

    public NotaFiscal(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.valorTotal = 0;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        valorTotal += produto.getTotal();
    }

    public void imprimirNotaFiscal() {
        System.out.println("Nota Fiscal");
        System.out.println("Cliente: " + cliente);
        System.out.println("Produtos: ");
        for (Produto p : produtos) {
            System.out.println(p);
        }
        System.out.println("Total: R$ " + valorTotal);
    }
}