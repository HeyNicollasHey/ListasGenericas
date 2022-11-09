package Model;

public class ProdutoModel {

    String nome;
    double preco;
    int porcDesconto;
    int estoque;

    public ProdutoModel(String nome, double preco, int porcDesconto, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.porcDesconto = porcDesconto;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getPorcDesconto() {
        return porcDesconto;
    }

    public void setPorcDesconto(int porcDesconto) {
        this.porcDesconto = porcDesconto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "{" +
                "Nome = " + nome + '\'' +
                "|| Preco = " + preco +
                "|| PorcDesconto = " + porcDesconto +
                "|| Estoque = " + estoque +
                '}';
    }
}
