package persons;
import java.util.Scanner;
import java.util.ArrayList;

public class Persons {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();
        
        int repet = 0, imput = -1;
        double media = 0;
        
        System.out.println(ANSI_PURPLE + "SISTEMA DE REGISTRO!\n" + ANSI_YELLOW + "Registre uma ou mais idades." + ANSI_RESET + "\n");
        while (imput != 0) {
            System.out.print("Registre a " + (repet + 1) + "° idade: ");
            imput = sc.nextInt();
            
            idades.add(imput);
            media += imput;
            
            System.out.print("\ndeseja continuar? (digite 0 para sair, ou qualquer outro pra continuar): ");
            imput = sc.nextInt();
            if (imput != 0) {
                System.out.print("\n");
                repet = 0;
            }
        }
        
        System.out.print(idades);
        
        sc.close();
        System.exit(0);
    }
}