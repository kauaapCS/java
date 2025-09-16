package aula6;
import java.util.Scanner;
public class Aula6 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        
        while (num != 9) {
            
            System.out.println("Escolha uma cor");
            System.out.println("1 - VERMELHO");
            System.out.println("2 - VERDE");
            System.out.println("3 - AMARELO");
            System.out.println("4 - AZUL");
            System.out.println("9 ENCERRA");
            System.out.print("OPÇÃO: ");
            num = sc.nextInt();
            
            switch (num) {
                case 1:
                    System.out.println(ANSI_RED + "VERMELHO" + ANSI_RESET);
                    break;
                case 2:
                    System.out.println(ANSI_GREEN + "VERDE" + ANSI_RESET);
                    break;
                case 3:
                    System.out.println(ANSI_YELLOW + "AMARELO" + ANSI_RESET);
                    break;
                case 4:
                    System.out.println(ANSI_BLUE + "AZUL" + ANSI_RESET);
                    break;
                case 9:
                    break;
                default:
                    System.out.println(ANSI_PURPLE + "OPÇÃO INVÁLIDA" + ANSI_RESET);
                    break;
            }
        }
        
        sc.close();
        System.exit(0);
    }
}
