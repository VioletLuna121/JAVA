
package Condicional;

import javax.swing.JOptionPane;

public class Atividade01 {
    public static void main(String[] args) {
     //O tipo da variavel é declarada logo aqui em cima
        
    String nome, curso,serie ,disciplina;
    double n1 = 0, n2 = 0, n3 = 0, n4 = 0, media;
  //JOptionPane.showInputDialog("")é usado para por algo que vai ser uma pergunta  
  //JOptionPane.showMessagemDialog("")é usado pra mostrar a resposta do codigo de cima 
    
  //O nome da variavel esta na frente pois a respostas das perguntas sera armazenda na devida variavel  
   nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
   curso = JOptionPane.showInputDialog("Qual o curso do aluno?");
   serie = JOptionPane.showInputDialog("Qual a série do aluno?");
   disciplina = JOptionPane.showInputDialog("Qual a disciplina do aluno?");
    
   //O tipo de variavel "double" deve possuir uma condicional especifica no Input dialog
   //sendo ela o "Double.parseDouble"
   //O JOption... vai ficar entre parenteses e se deve fechar no final da pergunta junto com o parenteses da pergunta
   //ex:condicional do tipo de variavel aqui(JOptionPane.showInputDialog(""))<-dois parenteses aqui;
   n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
   n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
   n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
   n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));
   
   media = (n1+n2+n3+n4)/4;
   
   //O "null" serve para que se a pessoa nao colocar nada na caixa de dialogo, o codigo dê errado
   JOptionPane.showMessageDialog(null,"O nome do aluno é: "+nome );
   JOptionPane.showMessageDialog(null,"A primeira nota do aluno é: "+n1 );
   JOptionPane.showMessageDialog(null,"A segunda nota do aluno é: "+n2 );
   JOptionPane.showMessageDialog(null,"A terceira nota do aluno é: "+n3 );
   JOptionPane.showMessageDialog(null,"A quarta nota do aluno é: "+n4 );
   JOptionPane.showMessageDialog(null,"A média do aluno é: "+media );
   
   
  //O +"\n" é usado para por o texto em um mesmo bloco quebrando a linha
   JOptionPane.showMessageDialog(null,"A primeira nota do aluno é: "+n1+" "
                                  +"\nA segunda nota do aluno é: "+n2+" "
                                  +"\nA terceira nota do aluno é: "+n3+" "
                                  +"\nA quarta nota do aluno é: "+n4+" "
                                  +"\nA média do aluno é: "+media+" ");
   
   if(media >= 7){
    JOptionPane.showMessageDialog(null,"O ALUNO ESTÁ APROVADO"); 
    
   }
   else if ( media < 7 && media >= 3){
       JOptionPane.showMessageDialog(null,"O ALUNO ESTA DE RECUPERAÇÃO");
   
   }
    else if(media < 3){
        JOptionPane.showMessageDialog(null,"O ALUNO ESTÁ REPROVADO");
    
    }
           
           
 }
}
