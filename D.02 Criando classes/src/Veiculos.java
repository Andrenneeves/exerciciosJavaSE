public class Veiculos {
    //Criando a classe de veiculo
    // Declarando as varáveis
    //private, pois os parametros das classes vão ser acessiveis só dentro do metodo
    private String modelo;
    private String fabricante;
    private String cor;
    private int ano;
    private double preco;
    // Construindo o constructor
    public Veiculos(String modelo, String fabricante, String cor, int ano, double preco){
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
    }
    // fazendo o Getter e o Setter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

//Preparando o que vai ser impresso
public void imprime(){
    System.out.println("Modelo: " + modelo);
    System.out.println("Fabricante: " + fabricante);
    System.out.println("Ano: " + ano);
    System.out.println("Cor: " + cor);
    System.out.println("Preço: " + preco);
}
}
