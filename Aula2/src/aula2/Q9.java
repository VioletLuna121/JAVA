
package aula2;


public class Q9 {
     public static void main(String[] args) {
       String nome="Violet";
       double SalFixo=2000;
       int Tvendas= 3000;
       double Com= (Tvendas*15)/100;
       double SalL= SalFixo+Com;
       
       System.out.println("O nome do vendedor é: "+nome);
       System.out.println("O salário fixo: "+SalFixo);
       System.out.println("O valor da comissão de vendas é:"+Com);
       System.out.println("O salário líquido do vendedor é: "+SalL);
       
       
     }
}
