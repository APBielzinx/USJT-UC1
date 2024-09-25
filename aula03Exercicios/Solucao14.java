package aula03Exercicios;

import javax.swing.*;

public class Solucao14 {

    /*
14) Escrever um algoritmo que receba vários números inteiros positivos e imprima a
quantidade de números primos dentre os números que foram digitados. Parar quando
for digitado um número não positivo.
    */
    public static void main(String[] args) {

        int contador = 0;
        int contadorNumPrimo = 0;
        while (true) {

            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

            if (numero < 0 ) {
                break;
            }


            for (int i = 2; i < numero; i++) {
               if (numero % i == 0) {
                   break;
               }else {
                   contadorNumPrimo++;
               }
            }

            contador++;
        }
        JOptionPane.showMessageDialog(null, "O total de numero primos foi: "+contadorNumPrimo);

    }

    }

