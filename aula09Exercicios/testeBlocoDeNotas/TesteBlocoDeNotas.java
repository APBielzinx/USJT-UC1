package aula09Exercicios.testeBlocoDeNotas;

import javax.swing.*;

public class TesteBlocoDeNotas {

    public static void main(String[] args) {
       menu();
    }

    public static void menu() {
        String opcoes = """
                 1) Insira uma nota
                 2) Remova uma nota\s
                 3) Altere uma nota\s
                 4) Listar todas as notas
                  5) Saia do sistema.
                \s""";
        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();
        while (true) {
            String opcaoEscolhida = JOptionPane.showInputDialog(opcoes);

            switch (opcaoEscolhida) {
                case "1": {
                    String nota = JOptionPane.showInputDialog("Digite a nota que deseja inserir:");
                    blocoDeNotas.inserirNota(nota);
                    break;
                }
                case "2": {
                    String nota = JOptionPane.showInputDialog("Digite a nota que deseja remover:");
                    blocoDeNotas.removerNota(nota);
                    break;
                }
                case "3": {
                    String notaAntiga = JOptionPane.showInputDialog("Digite a nota que deseja atualizar:");
                    String notaNova = JOptionPane.showInputDialog("Digite o novo conteúdo da nota:");
                    blocoDeNotas.atualizarNota(notaAntiga, notaNova);
                    break;
                }
                case "4": {
                    blocoDeNotas.imprimirNotas();
                    break;
                }
                case "5": {
                    JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                    System.exit(0);
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                }
            }

        }
    }
}
