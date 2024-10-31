package aula06Exercicios.exemploTestePagamento;

public class Pagamento {

    private String nomePagador;
    private double valorPagamento;


    public Pagamento(String nomePagador, double valorPagamento) {
        this.nomePagador = nomePagador;
        this.valorPagamento = valorPagamento;
    }

    public String getNomePagador() {
        return nomePagador;
    }

    public void setNomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }
}
