
package Scanner;

import java.util.Scanner;

public class Q1_Scanner {
    public static void main(String[] args) {

        
        Scanner in= new Scanner(System.in);
       
       System.out.println("Qual o seu nome?");
       String nome= in.nextLine();
       System.out.println( "Qual o seu gênero?" );
       String sexo = in.nextLine();
       System.out.println("Qual sua média?");
       double media=in.nextDouble();
       System.out.println("Qual sua temperatura %f?");
       float temp=in.nextFloat();
       System.out.printf(" com numero: ");
       int num=in.nextInt();
       
       
         System.out.println("Olá "+nome+", você é do gênero "+sexo);
         System.out.println("Sua média é: "+media);
         System.out.println("Sua temperatura está: "+temp);
         System.out.println("Seu número é: "+num);
    } 
}
