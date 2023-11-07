package visitor;

public class Livro implements IProduto {
    private String nome;
    private String autor;
    private double preco;

    public Livro(String nome, String autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public String aceitar(IVisitor visitor) {
        return visitor.exibirLivro(this);
    }
}
