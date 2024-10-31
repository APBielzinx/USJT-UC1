package aula06Exercicios.exemploTesteEmpresa;

import javax.swing.JOptionPane;

public class TesteEmpregados {
    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica("João", "Silva", "123.456.789-00");
        JOptionPane.showMessageDialog(null, pessoa.dados());

        Desempregado desempregado = new Desempregado("Maria", "Oliveira", "987.654.321-00", 1200.0);
        JOptionPane.showMessageDialog(null, desempregado.dados());

        Empregado empregado = new Empregado("Carlos", "Pereira", "111.222.333-44", 2500.0);
        JOptionPane.showMessageDialog(null, empregado.dados());

        Mensalista mensalista = new Mensalista("Ana", "Souza", "555.666.777-88", 3000.0);
        JOptionPane.showMessageDialog(null, mensalista.dados());

        Horista horista = new Horista("Fernando", "Almeida", "222.333.444-55", 20.0, 160);
        JOptionPane.showMessageDialog(null, horista.dados());

        Tarefeiro tarefeiro = new Tarefeiro("Julia", "Lima", "333.444.555-66", 15.0, 10);
        JOptionPane.showMessageDialog(null, tarefeiro.dados());

        Vendedor vendedor = new Vendedor("Roberto", "Melo", "444.555.666-77", 2000.0, 50.0, 5);
        JOptionPane.showMessageDialog(null, vendedor.dados());
    }
}
