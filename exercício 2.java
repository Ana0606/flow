import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double n1, n2, soma;

        System.out.println("Vamos fazer a soma de dois números");
        System.out.println("Informe o primeiro número");
        n1 = input.nextDouble();
        System.out.println("Informe o segundo número");
        n2 = input.nextDouble();
        soma = n1 + n2;
        System.out.print("A soma dos dois número é: ");
        System.out.println(soma);
    }
}
