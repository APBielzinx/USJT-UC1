package aula03Exercicios;

import javax.swing.*;

public class Solucao07 {

    /*
7) Imprimir na tela todos os números múltiplos de 5, no intervalo de 1 a 500.
    */
    public static void main(String[] args) {

        for (int i = 1; i <= 500 ; i++) {
            if (i%5 == 0){
                JOptionPane.showMessageDialog(null,i);
            }
        }


    }

}
