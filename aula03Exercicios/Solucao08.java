package aula03Exercicios;

import javax.swing.*;

public class Solucao08 {

    /*
8) Imprimir na tela o produto de todos os números de 120 a 300.
    */
    public static void main(String[] args) {

        double produto = 1.0;

        for (int i = 120; i <= 300; i++) {
            produto = produto + i;
        }

       JOptionPane.showMessageDialog(null,"O produto de todos os numero é "+ produto);
    }

    }

