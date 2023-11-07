package visitor;

public class Eletronico implements IProduto {
    private String nome;
    private String marca;
    private double preco;

    public Eletronico(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public String aceitar(IVisitor visitor) {
        return visitor.exibirEletronico(this);
    }
}
