package application1;
import java.util.Scanner;

public class Application1 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nro1, nro2, soma;
        System.out.printf("Informe o primeiro número: ");
        nro1 = sc.nextInt();
        System.out.printf("Informe o segundo número: ");
        nro2 = sc.nextInt();
        soma = somarValores(nro1, nro2);
        System.out.println("Valor da soma = " + soma);
    }
    
    public static int somarValores(int a, int b) {
        return (a+b);
    }
}