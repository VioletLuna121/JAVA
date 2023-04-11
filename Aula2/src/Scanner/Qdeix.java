
package Scanner;

import java.util.Scanner;

public class Qdeix {
     public static void main(String[] args) {
         //O Scanner faz com que crie-se uma variavel onde possa o usuario interagir
         Scanner in= new Scanner(System.in); 
         
         System.out.println("Qual o seu nome?");
         String nome=in.nextLine();
         System.out.println("Qual sua idade?");
         int idade=in.nextInt();
         System.out.print("Ola "+nome+" seja bem vindo(a),você tem "+idade+" anos");
                 
         
     }
}
