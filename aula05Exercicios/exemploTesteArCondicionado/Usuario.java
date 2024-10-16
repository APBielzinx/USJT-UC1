package aula05Exercicios.exemploTesteArCondicionado;

import javax.swing.JOptionPane;

public class Usuario {
    public static void main(String[] args) {
        CondicionadorDeAr condicionador = new CondicionadorDeAr();

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja ligar o condicionador de ar?", "Ligar Condicionador", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            condicionador.ligar();
        }

        for (int i = 0; i < 10; i++) {
            condicionador.aumentarTemperatura();
        }

        for (int i = 0; i < 20; i++) {
            condicionador.reduzirTemperatura();
        }

        while (condicionador.getTermostato().getTemperatura() < 25) {
            condicionador.aumentarTemperatura();
        }

        condicionador.imprimirTemperatura();

        opcao = JOptionPane.showConfirmDialog(null, "Deseja desligar o condicionador de ar?", "Desligar Condicionador", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            condicionador.desligar();
        }
    }
}
