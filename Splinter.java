package Arcondicionado;

public class Splinter extends ArCondicionado {
    private String tamanho;

    // Construtor
    public Splinter(String codigo, String marca, int btu, String defeito, String tamanho) {
        super("Splinter", codigo, marca, btu, defeito); // Chama o construtor da classe base
        this.tamanho = tamanho;
    }

    // Implementação do método abstrato para exibir as informações do Splinter
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("BTU: " + btu);
        System.out.println("Defeito: " + defeito);
        System.out.println("Tamanho: " + tamanho);
        System.out.println();
    }

    // Getter e Setter
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
