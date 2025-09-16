package sistemanota;
import java.util.Scanner;
public class Sistemanota {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0, imput = 0;
        int notas = 3, repet = 0;
        
        System.out.println(ANSI_PURPLE + "SISTEMA DE NOTAS!\n" + ANSI_YELLOW + "Registre 3 notas do aluno." + ANSI_RESET + "\n");
        
        while (repet != notas) {
            System.out.print("Registre a " + (repet + 1) + "° nota do aluno: ");
            imput = sc.nextDouble();
            if (imput < 11 && imput > -1) {
                repet += 1;
                nota += imput;
            } else {
                System.out.println(ANSI_RED + "Nota inválida!" + ANSI_RESET);
            }
        }
        
        nota = nota / notas;
        
        if (nota == 10) {
            System.out.println("\n" + ANSI_GREEN + "Aprovado com Distinção!" + ANSI_RESET + " O aluno obteve média: " + nota);
        } else if (nota >= 7) {
            System.out.println("\n" + ANSI_BLUE + "Aprovado!" + ANSI_RESET + " O aluno obteve média: " + nota);
        } else {
            System.out.println("\n" + ANSI_RED + "Reprovado!" + ANSI_RESET + " O aluno obteve média: " + nota);
        }
    } 
}
