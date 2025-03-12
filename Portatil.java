package Arcondicionado;

public class Portatil extends ArCondicionado {
    private String voltagem;
    private String cor;

    // Construtor
    public Portatil(String codigo, String marca, int btu, String defeito, String voltagem, String cor) {
        super("Portátil", codigo, marca, btu, defeito); // Chama o construtor da classe base
        this.voltagem = voltagem;
        this.cor = cor;
    }

    // Implementação do método abstrato para exibir as informações do Portátil
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("BTU: " + btu);
        System.out.println("Defeito: " + defeito);
        System.out.println("Voltagem: " + voltagem);
        System.out.println("Cor: " + cor);
        System.out.println();
    }

    // Getters e Setters
    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
