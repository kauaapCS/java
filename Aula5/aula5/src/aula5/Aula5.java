package aula5;
import java.util.Scanner;
public class Aula5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        double base, altura, raio;
        double pi = 3.1416;
        double areac, areat, areaq;
        
        while (opc != 9) {
            System.out.println("Faça a opção da figura oara cálculo da área");
            System.out.println("1 - quadrado");
            System.out.println("2 - triângulo retângulo");
            System.out.println("3 - círculo");
            System.out.println("9 - encerrar");
            System.out.println("Opção:\t");
            opc = sc.nextInt();
            
            if (opc == 1) {
                System.out.print("entre com o valor da base: ");
                base = sc.nextDouble();
                System.out.print("Entre com o valor da altura: ");
                altura = sc.nextDouble();
                areaq = base * altura;
                System.out.println("Área do quadrado:" + areaq);
            } else if (opc == 2) {
                System.out.print("entre com o valor da base: ");
                base = sc.nextDouble();
                System.out.print("Entre com o valor da altura: ");
                altura = sc.nextDouble();
                areat = (base * altura) / 2;
                System.out.println("Área do triângulo:" + areat);
            } else if (opc == 3) {
                System.out.print("entre com o valor do raio: ");
                raio = sc.nextDouble();
                areac = (pi * (raio * raio));
                System.out.println("Área do círculo:" + areac);
            } else if (opc != 9) {
                System.out.println("Opção inválida " + opc);
            }
        }
        
        sc.close();
        System.exit(0);
    }
}
