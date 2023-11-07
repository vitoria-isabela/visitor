package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void Given_Livro_When_ExibirLivro_Then_DeveRetornarInfoLivro() {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 49.99);
        ProdutoVisitor visitor = new ProdutoVisitor();

        String info = visitor.exibir(livro);

        assertEquals("Livro{nome='O Senhor dos Anéis', autor='J.R.R. Tolkien', preco=49.99}", info);
    }

    @Test
    void Given_Eletronico_When_ExibirEletronico_Then_DeveRetornarInfoEletronico() {
        Eletronico eletronico = new Eletronico("Smartphone", "Samsung", 799.99);
        ProdutoVisitor visitor = new ProdutoVisitor();

        String info = visitor.exibir(eletronico);

        assertEquals("Eletrônico{nome='Smartphone', marca='Samsung', preco=799.99}", info);
    }
}
