public class Produto {
    private String nome;
    private String fabricante;
    private int codBarra;
    private double preco;

    public Produto() {}

    public Produto(String nome, String fabricante, int codBarra, double preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.codBarra = codBarra;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(int codBarra) {
        this.codBarra = codBarra;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void impressao(){
        System.out.println("Nome: " + nome);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Código de Barras: " + codBarra);
        System.out.println("Preço do produto: " +preco);
    }


}
