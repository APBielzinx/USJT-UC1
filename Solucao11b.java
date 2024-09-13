import javax.swing.JOptionPane;

public class Solucao11b{

/*
11) Entre com uma data em uma variável do tipo inteiro no formato ddmmaa e
imprimir dia, mês e ano separados;
*/
   public static void main(String args[]){

   int data = Integer.parseInt(JOptionPane.showInputDialog("inscira uma data no fomato ddmmaa"));
   String dataFormatada =""+ data;
   String dia = dataFormatada.substring(0,2); 
   String mes = dataFormatada.substring(2,4);   
   String ano = dataFormatada.substring(4,6);   

  
   JOptionPane.showMessageDialog(null," dia "+dia+" mes "+mes+" ano "+ano);
}
}