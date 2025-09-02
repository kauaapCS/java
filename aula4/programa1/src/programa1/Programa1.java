package programa1;
import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        int soma = 0, num = 0;
        boolean acesso = true;
        Scanner ler = new Scanner(System.in);
        while (acesso) {
            System.out.println("Digite um número inteiro (0 para sair):");
            num = ler.nextInt();
            soma += num;
            if (num == 0) acesso = false;
        }
        System.out.println("Valor da soma: " + soma);
    }
}