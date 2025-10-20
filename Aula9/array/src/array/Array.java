package array;
import java.util.Scanner;
//import java.util.Arrays;
import java.util.ArrayList;

public class Array {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> pares = new ArrayList<>(), impares = new ArrayList<>();
        int p = 0, i = 0;
        double num, resto;
        
        for (int n = 0; n < 10; n++) {
            System.out.print("Digite um número: ");
            num = sc.nextDouble();
            resto = num % 2;
            if (resto == 0) {
                pares.add(num);
                p++;
            } else {
                impares.add(num);
                i++;
            }
        } 
        
        System.out.println("\nPares: " + pares);
        System.out.println("Impares: " + impares);
        
        sc.close();
        System.exit(0);
    }
}