package aula03Exercicios;

import javax.swing.*;

public class Solucao11 {

    /*
11) Uma empresa de fornecimento de energia elétrica faz a leitura mensal dos
medidores de consumo. Para cada consumidor são digitados os seguintes dados:
código do consumidor, quantidade de kWh consumidos durante o mês, tipo do
consumidor. Os tipos podem ser 1 - residencial, preço por kWh = R$ 0,3; 2 - comercial,
preço por kWh = 0,5; 3 - industrial, preço por kWh = 0,7. Os dados devem ser lidos até
que seja encontrado um consumidor com código 0 (zero). Calcular e imprimir o custo
total para cada consumidor, o total de consumo para os três tipos de consumidor, a
média de consumo dos tipos 1 e 2.
    */
    public static void main(String[] args) {

        double totalConsumo1 = 0;
        double totalConsumo2 = 0;
        double totalConsumo3 = 0;

        int contador = 0;
        int contadorConsumidor1e2 = 0;
        double mediaConsumidor1e2 = 0.0;
        while (true){

        String codigoConsumidor = JOptionPane.showInputDialog("Insira o codigo da consumidor: ");

        if (codigoConsumidor.equalsIgnoreCase("0")){
            break;
        }

        double qtdKwh = Double.parseDouble(JOptionPane.showInputDialog("insira a quantidade de kWh consumidos durante o mês"));
        int tipoConsumidor = Integer.parseInt(JOptionPane.showInputDialog("insira a tipo de consumidor: "));

        double custoTotal = 0;
        if (tipoConsumidor == 1){
           custoTotal = qtdKwh * 0.3;
           totalConsumo1 = totalConsumo1 + qtdKwh;
        }

        if (tipoConsumidor == 2){
                custoTotal = qtdKwh * 0.5;
                totalConsumo2 = totalConsumo2 + qtdKwh;

        }

        if (tipoConsumidor == 3){
                custoTotal = qtdKwh * 0.7;
                totalConsumo3 = totalConsumo3 + qtdKwh;


        }

        if (tipoConsumidor == 1 || tipoConsumidor == 2){
            mediaConsumidor1e2 = mediaConsumidor1e2 + qtdKwh;
            contadorConsumidor1e2++;
        }

        JOptionPane.showMessageDialog(null, "O custo total do consumidor de codigo: "+codigoConsumidor+" é: "+ custoTotal);


        contador++;
     }
        JOptionPane.showMessageDialog(null,"O total de consumo para o tipo 1 é: "+ totalConsumo1+"\n"+
                "O total de consumo para o tipo 2 é: "+totalConsumo2+"\n O total de consumo para o tipo 3 é: "+totalConsumo3);

        JOptionPane.showMessageDialog(null,"a media do consumidor 1 e 2 é: "+ (mediaConsumidor1e2/contadorConsumidor1e2)+"\n");


    }

    }

