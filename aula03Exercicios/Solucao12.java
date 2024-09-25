package aula03Exercicios;

import javax.swing.*;

public class Solucao12 {

    /*
12) Entrar com a idade de várias pessoas e imprimir: total de pessoas com menos de
21 anos e total de pessoas com mais de 50 anos. Parar quando for digitada uma idade
fora da faixa 0-120 anos.
    */
    public static void main(String[] args) {

        int contador = 0;
        int idadeMenos21 = 0;
        int idadeMaior50 = 0;

        while (true) {

            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade"));

            if (idade < 0 || idade > 120) {
                break;
            }

            if (idade < 21){
                idadeMenos21++;
            }
            if (idade > 50){
                idadeMaior50++;
            }

            contador++;
        }

        JOptionPane.showMessageDialog(null,"O total de pessoas com menos de 21 anos é: "+idadeMenos21+
                "\n O total de pessoas com mais de 50 anos é: "+idadeMaior50);

    }

    }

