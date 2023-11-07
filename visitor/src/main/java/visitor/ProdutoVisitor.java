package visitor;

public class ProdutoVisitor implements IVisitor {
    public String exibir(IProduto produto) {
        return produto.aceitar(this);
    }

    @Override
    public String exibirLivro(Livro livro) {
        return "Livro{" +
                "nome='" + livro.getNome() + '\'' +
                ", autor='" + livro.getAutor() + '\'' +
                ", preco=" + livro.getPreco() +
                '}';
    }

    @Override
    public String exibirEletronico(Eletronico eletronico) {
        return "Eletrônico{" +
                "nome='" + eletronico.getNome() + '\'' +
                ", marca='" + eletronico.getMarca() + '\'' +
                ", preco=" + eletronico.getPreco() +
                '}';
    }
}