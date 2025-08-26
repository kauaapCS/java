package programaex4;
import java.util.Scanner;

public class Programaex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        char sexo;
        double altura, resultado;
        
        System.out.println("Informe o sexo (M/F):");
        sexo = ler.next().charAt(0);
        
        System.out.println("Informe a altura em metros:");
        altura = ler.nextDouble();
        
        if (sexo == "M".charAt(0)) {
            resultado = (72.7 * altura) - 58;
        } else {
            resultado = (62.1 * altura) - 44.7;
        }
        
        System.out.println("Peso ideal: " + resultado);
    }
}