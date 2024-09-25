package aula03Exercicios;

import javax.swing.*;

public class Solucao09 {

    /*
9) Imprimir na tela todos os números de 1 a 100 e a soma deles.
    */
    public static void main(String[] args) {

        double total = 0;
        for (int i = 1; i <= 100; i++) {

            total = total + i;

            JOptionPane.showMessageDialog(null,"os numeros são "+ i);
            JOptionPane.showMessageDialog(null,"o valor da soma é: "+total);
        }


    }

    }

