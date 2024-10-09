package aula04Exercicios.exemploTurma;

import javax.swing.*;

public class TesteTurma {


    /*

2) Crie a classe TesteTurma com o método main. De modo análogo ao exemplo, peça
para o usuário entrar com os valores necessários para criar uma turma, instancie um
objeto Turma e depois exiba os dados da turma criada. Depois, peça para o usuário
uma nova quantidade de alunos, altere o valor do atributo e exiba os dados
novamente.
*/

    public static void main(String[] args) {


     String nome =   JOptionPane.showInputDialog("Digite o nome da turma");
     String curso =   JOptionPane.showInputDialog("Digite o curso da turma");
    int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
    int serie =   Integer.parseInt(JOptionPane.showInputDialog("Digite a serie"));

    Turma turma= new Turma(nome, curso, quantidadeDeAlunos, serie);

    JOptionPane.showMessageDialog(null, "O nome da turma é "+turma.getNome() +"\n"+
                                                                "O curso da turma é "+turma.getCurso()+"\n"+
                                                                "a quantidade de alunos é "+turma.getQuantidadeDeAlunos()+"\n"+
                                                                "a serie é "+turma.getSerie()+"\n"

    );

    turma.setQuantidadeDeAlunos(Integer.parseInt(JOptionPane.showInputDialog("Digite uma nova quantidade de alunos")));


        JOptionPane.showMessageDialog(null, "O nome da turma é "+turma.getNome() +"\n"+
                "O curso da turma é "+turma.getCurso()+"\n"+
                "a quantidade de alunos é "+turma.getQuantidadeDeAlunos()+"\n"+
                "a serie é "+turma.getSerie()+"\n"

        );
    }

}
