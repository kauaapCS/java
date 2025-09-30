package comparador;
import java.util.Scanner;

public class Comparador {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeros[] = new double[8], upnum = Integer.MIN_VALUE, downnum = Integer.MAX_VALUE, media = 0, imput;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextDouble();
            media += numeros[i];
            if (numeros[i] > upnum) upnum = numeros[i];
            if (numeros[i] < downnum) downnum = numeros[i];
        }
        
        System.out.println("\nMaior Número: " + upnum + "\nMenor Número: " + downnum + "\nMédia: " + (media / numeros.length));
        sc.close();
        System.exit(0);
    }
}
