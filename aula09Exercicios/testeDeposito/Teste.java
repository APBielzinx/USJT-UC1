package aula09Exercicios.testeDeposito;

import javax.swing.*;

public class Teste {
    public static void main(String[] args) {
        Deposito deposito = new Deposito();

        while (true) {
            String opcoes = """
                    Escolha uma opção:
                    1. Adicionar caixa
                    2. Remover caixa
                    3. Procurar caixa
                    4. Alterar caixa
                    5. Listar caixas mais pesadas que (Valor Digitado)
                    6. Sair
                    """;
            String escolha = JOptionPane.showInputDialog(opcoes);

            switch (escolha) {
                case "1": {
                    String corredor = JOptionPane.showInputDialog("Digite o corredor: ");
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao: "));
                    double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da caixa:"));
                    String dono = JOptionPane.showInputDialog("Digite o nome do dono da caixa:");

                    deposito.adicionarCaixa(new Caixa(corredor,posicao,peso,dono));
                    break;
                }
                case "2": {
                    String dono = JOptionPane.showInputDialog("Digite o nome do dono da caixa que deseja remover:");
                    deposito.removerCaixa(dono);
                    break;
                }
                case "3": {
                    String dono = JOptionPane.showInputDialog("Digite o nome do dono da caixa que deseja procurar:");
                    deposito.exibirCaixasPorDono(dono);
                    break;
                }
                case "4": {
                    String dono = JOptionPane.showInputDialog("Digite o nome do dono da caixa que deseja atualizar:");
                    String corredor = JOptionPane.showInputDialog("Digite o corredor da caixa nova: ");
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao da caixa nova: "));
                    double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da caixa da caixa nova: "));
                    deposito.atualizarCaixa(new Caixa(corredor, posicao, peso,dono), dono);
                    break;
                }
                case "5": {
                    double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso que deseja filtrar"));
                    deposito.caixasPesadas(peso);
                    break;
                }
                case "6": {
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
