package aula03Exercicios;

import javax.swing.*;

public class Solucao04 {

    /*
   4) Ler vários números e informar quantos números entre 100 e 200 foram digitados.
Quando o valor 0 (zero) for lido o algoritmo deverá cessar sua execução.
    */
    public static void main(String[] args) {

        int contador = 0;
        int numeroEntre100e200 = 0;

        while (true){

           double numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor, para parar digite 0"));

           if (numero == 0){
               break;
           }
           if (numero > 100 && numero < 200){
               numeroEntre100e200++;
           }

           contador++;
        }

        JOptionPane.showMessageDialog(null, "O total de número entre 100 e 200 foi "+numeroEntre100e200);

    }

}
