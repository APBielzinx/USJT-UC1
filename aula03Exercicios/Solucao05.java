package aula03Exercicios;

import javax.swing.*;

public class Solucao05 {

    /*
5) Entrar com nomes enquanto forem diferentes de FIM e imprimir cada nome
digitado.
    */
    public static void main(String[] args) {

        int contador = 0;
        int numeroEntre100e200 = 0;
        String nomes = "";

        while (true){

           String nome = JOptionPane.showInputDialog("Insira um nome, para parar digite FIM");

           if (nome.equalsIgnoreCase("FIM")){
               break;
           }
           nomes = nomes+"\n"+nome;
           contador++;
        }

        JOptionPane.showMessageDialog(null, "Os nomes digitados foram: "+nomes);

    }

}
