/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa1a;
import java.util.Scanner;

/**
 *
 * @author KAUAAMAROPIRES
 */
public class Programa1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int num1, num2, soma;
        System.out.println("Informe o primeiro número:");
        num1 = ler.nextInt();
        System.out.println("Informe o segundo número:");
        num2 = ler.nextInt();
        soma = num1 + num2;
        System.out.printf("O resultado da soma é: ", soma);
    }
    
}
