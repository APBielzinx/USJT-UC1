package aula02Exercicios;

import javax.swing.*;

public class Solucao13 {

    /*
13) Ler um número inteiro de 3 casas decimais e imprimir se o algarismo da casa das
dezenas é par ou ímpar.
*/
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro de 3 dígitos:");
        int numero = Integer.parseInt(input);
        if (numero >= 100 && numero <= 999) {

            int dezenas = (numero / 10) % 10;
            String mensagem;

            if (dezenas % 2 == 0) {
                mensagem = "O algarismo da casa das dezenas é par.";
            } else {
                mensagem = "O algarismo da casa das dezenas é ímpar.";
            }
            JOptionPane.showMessageDialog(null, mensagem);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, digite um número válido de 3 dígitos.");
        }


    }

}
