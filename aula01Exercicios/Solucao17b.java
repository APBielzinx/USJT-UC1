package aula01Exercicios;

import javax.swing.*;

public class Solucao17b {

    /*
    17) Criar um algoritmo que calcule e imprime a área de um triângulo;
    */
    public static void main(String[] args) {

        double base = Double.parseDouble(JOptionPane.showInputDialog("digite a base do triangulo"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("digite a altura do triangulo"));


        double area = base * altura;

        JOptionPane.showMessageDialog(null, " a area do triangulo é: " + area);
    }
}