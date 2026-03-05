import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int dias;
        double valor, salario;

        System.out.println("Informe o valor cobrado por uma diarista");
        valor = input.nextDouble();
        System.out.println("Informe a quantidade de dias trabalhados");
        dias = input.nextInt();
        salario = valor * dias;
        System.out.print("O salário mensal da diarista será de: ");
        System.out.println(salario);
    }
}
