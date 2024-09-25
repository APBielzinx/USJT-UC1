package aula03Exercicios;

import javax.swing.*;

public class Solucao10 {

    /*
10) Ler vários números até entrar o número -999. Para cada número, imprimir seus
divisores.
    */
    public static void main(String[] args) {

     while (true){
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));

        if (numero == -999){
            break;
        }

         for (int i = 0; i < numero; i++) {
             if (numero % i == 0){
                 JOptionPane.showMessageDialog(null, "O numero "+numero+" pode ser dividido por: "+i);
             }

         }

     }

    }

    }

