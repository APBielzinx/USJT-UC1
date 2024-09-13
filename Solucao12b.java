import javax.swing.JOptionPane;

public class Solucao12b{

/*
12) Entre com uma data em uma variável do tipo String no formato dd/mm/aa e
imprimir dia, mês e ano separados.
*/
   public static void main(String args[]){

   String data = JOptionPane.showInputDialog("inscira uma data no fomato  dd/mm/aa");
   String dataFormatada =""+ data;
   String dia = dataFormatada.substring(0,2); 
   String mes = dataFormatada.substring(3,5);   
   String ano = dataFormatada.substring(6,8);   

  
   JOptionPane.showMessageDialog(null," dia "+dia+" mes "+mes+" ano "+ano);
}
}