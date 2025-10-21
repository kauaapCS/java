package dividenumero;
import java.util.Scanner;

public class Dividenumero {
    public static void main(String[] args) {
        try {
           Scanner sc = new Scanner(System.in);
           int dividir = 0, divisor = 0;
           double result = 0;
           
           System.out.print("Digite o numero para dividir: ");
           dividir = sc.nextInt();
           
           System.out.print("Digite o numero para ser o divisor: ");
           divisor = sc.nextInt();
           
           result = dividir / divisor;
           
           System.out.println("Resultado de " + dividir + " / " + divisor + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Não é possivel dividir por 0!");
        }
    }
}