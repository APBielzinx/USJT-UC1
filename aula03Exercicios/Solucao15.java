package aula03Exercicios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Solucao15 {

    /*
15) Entrar com vários números e imprimir o maior. O algoritmo para quando se digita
-9999.
    */
    public static void main(String[] args) {

        List<Double> numeros = new ArrayList<>();

        while (true) {
            double numero= Double.parseDouble(JOptionPane.showInputDialog("Digite um número (-9999 para sair):"));

            if (numero == -9999) {
                break;
            }

            numeros.add(numero);
        }

        if (numeros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum número foi digitado.");
            return;
        }

        Double maiorNumero = numeros.getFirst();

        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) > maiorNumero) {
                maiorNumero = numeros.get(i);
            }
        }

        JOptionPane.showMessageDialog(null, "O maior número é: " + maiorNumero);
    }
}


