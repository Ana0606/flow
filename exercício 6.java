import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double valor, desconto, calculo, valorFinal;

        System.out.println("Informe o valor do produto");
        valor = input.nextDouble();
        System.out.println("Informe a porcentagem de desconto");
        desconto = input.nextDouble();
        calculo = valor * desconto / 100;
        valorFinal = valor - calculo;
        System.out.print("O valor com desconto será de: ");
        System.out.println(valorFinal);
    }
}
