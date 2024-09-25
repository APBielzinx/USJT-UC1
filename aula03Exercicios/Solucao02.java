package aula03Exercicios;

import javax.swing.*;

public class Solucao02 {

    /*
   2) Imprimir na tela os 100 primeiros números pares.
    */
    public static void main(String[] args) {

        for (int i = 0; i <= 100 ; i++) {
            if (i%2 == 0){
            JOptionPane.showMessageDialog(null,i);
        }
        }

    }

}
