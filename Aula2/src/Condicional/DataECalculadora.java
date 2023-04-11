
package Condicional;
import javax.swing.JOptionPane;
public class DataECalculadora {
    public static void main(String[] args) { 
        
        int semana=0, calc=0, n1, n2;
        JOptionPane.showMessageDialog(null,
               "\nEscolha um dia da semana"+
                "-------------------------"+
                "\nDigite 1 para Domingo"+
                "\nDigite 2 para Segunda-Feira"+
                "\nDigite 3 para Terça-Feira"+
                "\nDigite 4 para Quarta-Feira"+
                "\nDigite 5 para Quinta-Feira"+
                "\nDigite 6 para Sexta-Feira"+
                "\nDigite 7 para Sabado");
        
       semana = Integer.parseInt(JOptionPane.showInputDialog("Qual dia da semana você escolheu?"));
        
      switch(semana){
          
          case 1:
          JOptionPane.showMessageDialog(null,"Você escolheu o Domingo");
              break;
          case 2:
          JOptionPane.showMessageDialog(null,"Você escolheu a Segunda-Feira");
              break;
          case 3:
          JOptionPane.showMessageDialog(null,"Você escolheu a Terça-Feira");
              break;
          case 4:
          JOptionPane.showMessageDialog(null,"Você escolheu a Quarta-Feira");
              break;
          case 5:
          JOptionPane.showMessageDialog(null,"Você escolheu a Quinta-Feira");
              break;
          case 6:
          JOptionPane.showMessageDialog(null,"Você escolheu a Sexta-Feira");
              break;
          case 7:
          JOptionPane.showMessageDialog(null,"Você escolheu o Sabado");
              break;
          default:
              JOptionPane.showMessageDialog(null,"Sua opção não existe");
              
      }
                                                                                        
        JOptionPane.showMessageDialog(null,
               "\nEscolha um opção da calculadora"+
                "--------------------------------"+
                "\nDigite 1 para Adição"+
                "\nDigite 2 para Subtração"+
                "\nDigite 3 para Divisão"+
                "\nDigite 4 para Multiplicação");
        
      calc = Integer.parseInt(JOptionPane.showInputDialog("Qual você escolheu?"));
      
      n1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva um número:"));
      
      n2 = Integer.parseInt(JOptionPane.showInputDialog("Escreva mais um número:"));
      
    switch(calc){
       case 1:
          JOptionPane.showMessageDialog(null,"Você escolheu a Soma");
       break; 
    }    
      
         
    }
}
