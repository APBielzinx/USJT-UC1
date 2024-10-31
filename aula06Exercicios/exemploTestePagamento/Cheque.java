package aula06Exercicios.exemploTestePagamento;

public class Cheque extends Pagamento{

    private String numeroDocheque;


    public Cheque(String nomePagador, double valorPagamento, String numeroDocheque) {
        super(nomePagador, valorPagamento);
        this.numeroDocheque = numeroDocheque;
    }

    public String getNumeroDocheque() {
        return numeroDocheque;
    }

    public void setNumeroDocheque(String numeroDocheque) {
        this.numeroDocheque = numeroDocheque;
    }
}
