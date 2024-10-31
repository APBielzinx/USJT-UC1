package aula06Exercicios.exemploTestePagamento;

public class CartaoDeCredito extends Pagamento{

    private String numeroDocartao;


    public CartaoDeCredito(String nomePagador, double valorPagamento,  String numeroDocartao) {
        super(nomePagador, valorPagamento);
        this.numeroDocartao = numeroDocartao;
    }

    public String getNumeroDocartao() {
        return numeroDocartao;
    }

    public void setNumeroDocartao(String numeroDocartao) {
        this.numeroDocartao = numeroDocartao;
    }
}
