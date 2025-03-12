package Arcondicionado;

public abstract class ArCondicionado {
    protected String modelo;
    protected String codigo;
    protected String marca;
    protected int btu;
    protected String defeito;

    // Construtor
    public ArCondicionado(String modelo, String codigo, String marca, int btu, String defeito) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.marca = marca;
        this.btu = btu;
        this.defeito = defeito;
    }

    // Método abstrato para exibir as informações do ar condicionado
    public abstract void exibirInfo();

    // Getters e Setters
    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public int getBtu() {
        return btu;
    }

    public void setBtu(int btu) {
        this.btu = btu;
    }
}
