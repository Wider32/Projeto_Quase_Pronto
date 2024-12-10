package SistemaNotas;

import java.util.Scanner;

import sistema.ClienteDao;
import sistema.Cliente;
import sistema.Conexao;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar cliente
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        // Criar a nota fiscal
        NotaFiscal notaFiscal = new NotaFiscal(cliente);

        // Adicionar produtos
        boolean adicionarMaisProdutos = true;
        while (adicionarMaisProdutos) {
            System.out.println("Digite o nome do produto: ");
            String nomeProduto = scanner.nextLine();
            System.out.println("Digite o preço do produto: ");
            double precoProduto = scanner.nextDouble();
            System.out.println("Digite a quantidade: ");
            int quantidadeProduto = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            Produto produto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
            notaFiscal.adicionarProduto(produto);

            System.out.println("Deseja adicionar mais produtos? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                adicionarMaisProdutos = false;
            }
        }

        // Imprimir a nota fiscal
        notaFiscal.imprimirNotaFiscal();
        scanner.close();
    }
}