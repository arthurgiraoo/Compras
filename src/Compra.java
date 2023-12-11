public class Compra {
    private double valor;
    private String descricao;

    public Compra(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Compras: valor: " + valor + ", descricao: " + descricao ;
    }
}
