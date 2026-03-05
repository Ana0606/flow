import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double m, cm;

        System.out.println("Vamos converter metros para centímetros");
        System.out.println("Informe o metro");
        m = input.nextDouble();
        cm = m * 100;
        System.out.print(m);
        System.out.print(" metros é igual a: ");
        System.out.print(cm);
        System.out.println(" centímetros");
    }
}
