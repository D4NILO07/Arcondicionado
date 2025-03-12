package Arcondicionado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleArCondicionado {
    private List<ArCondicionado> aparelhos; // Lista de aparelhos cadastrados
    private Scanner scanner;

    // Construtor
    public ControleArCondicionado() {
        aparelhos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Menu principal de opções
    public void menu() {
        int opcao;
        do {
            System.out.println("Controle de Ar Condicionado");
            System.out.println("1. Cadastrar Ar Condicionado");
            System.out.println("2. Gerar Relatório");
            System.out.println("3. Fechar Programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha
            switch (opcao) {
                case 1:
                    cadastrarArCondicionado();
                    break;
                case 2:
                    gerarRelatorio();
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    // Função para cadastrar um novo aparelho
    private void cadastrarArCondicionado() {
        System.out.print("Digite o modelo (Splinter ou Portátil): ");
        String modelo = scanner.nextLine();
        System.out.print("Digite o código do aparelho: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite a marca do aparelho: ");
        String marca = scanner.nextLine();
        System.out.print("Digite a potência em BTU: ");
        int btu = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Digite o defeito do aparelho (caso não tenha, digite 'Nenhum'): ");
        String defeito = scanner.nextLine();

        // Lógica de cadastro para cada tipo de ar condicionado
        if (modelo.equalsIgnoreCase("Splinter")) {
            System.out.print("Digite o tamanho do aparelho: ");
            String tamanho = scanner.nextLine();
            aparelhos.add(new Splinter(codigo, marca, btu, defeito, tamanho));
        } else if (modelo.equalsIgnoreCase("Portátil")) {
            System.out.print("Digite a voltagem do aparelho: ");
            String voltagem = scanner.nextLine();
            System.out.print("Digite a cor do aparelho: ");
            String cor = scanner.nextLine();
            aparelhos.add(new Portatil(codigo, marca, btu, defeito, voltagem, cor));
        } else {
            System.out.println("Modelo inválido. Tente novamente.");
        }
    }

    // Função para gerar o relatório com todos os aparelhos cadastrados
    private void gerarRelatorio() {
        if (aparelhos.isEmpty()) {
            System.out.println("Nenhum aparelho cadastrado.");
        } else {
            System.out.println("\nRelatório de Ar Condicionados Cadastrados:");
            for (ArCondicionado aparelho : aparelhos) {
                aparelho.exibirInfo();
            }
        }
    }

    // Função principal para rodar o programa
    public static void main(String[] args) {
        ControleArCondicionado controle = new ControleArCondicionado();
        controle.menu();
    }
}
