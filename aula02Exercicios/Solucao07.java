package aula02Exercicios;

import javax.swing.*;

public class Solucao07 {

    /*
7) Entrar com o nome, sexo e idade de uma pessoa. Se a pessoa for do sexo feminino
e tiver menos que 25 anos, imprimir nome e a mensagem: ACEITA. Caso contrário,
imprimir nome e a mensagem: NÃO ACEITA. (Considerar f ou F.)
*/
    public static void main(String[] args) {
     String nome = JOptionPane.showInputDialog("insira seu nome");
     int idade = Integer.parseInt(JOptionPane.showInputDialog("insira sua idade"));
     String sexo = JOptionPane.showInputDialog("insira seu sexo (F ou M)");

     if (sexo.equalsIgnoreCase("f") && idade < 25) {

         JOptionPane.showMessageDialog(null, nome +" ACEITA");

     }else{
         JOptionPane.showMessageDialog(null, nome +" NÃO ACEITA");

     }



    }

}
