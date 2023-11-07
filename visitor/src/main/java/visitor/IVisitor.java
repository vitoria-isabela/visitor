package visitor;

public interface IVisitor {
    String exibir(IProduto produto);
    String exibirLivro(Livro livro);
    String exibirEletronico(Eletronico eletronico);
}
