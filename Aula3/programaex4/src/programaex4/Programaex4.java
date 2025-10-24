package programaex4;
import java.util.Scanner;

public class Programaex4 {
    public static void main(String[] args) {
        String sexo;
        double altura, resultado = 0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o sexo (M/F):");
        sexo = ler.next().toLowerCase();
        
        System.out.println("Informe a altura em metros:");
        altura = ler.nextDouble();
        
        if ("m".equals(sexo)) {
            resultado = (72.7 * altura) - 58;
        } else {
            resultado = (62.1 * altura) - 44.7;
        };
        
        System.out.println("Peso ideal: " + resultado);
    }
}
