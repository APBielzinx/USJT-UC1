package aula06Exercicios.exemploTestePagamento;

public class Boleto extends Pagamento{

    private String numeroDoBoleto;
    private int dia;
    private int mes;
    private int ano;

    public Boleto(String nomePagador, double valorPagamento,  int dia, int mes, int ano) {
        super(nomePagador, valorPagamento);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }


    public String getNumeroDoBoleto() {
        return numeroDoBoleto;
    }

    public void setNumeroDoBoleto(String numeroDoBoleto) {
        this.numeroDoBoleto = numeroDoBoleto;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
