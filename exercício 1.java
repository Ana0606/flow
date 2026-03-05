import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nome;
        int n1, dobro;

        System.out.println("Qual seu nome?");
        nome = input.nextLine();
        System.out.print("Olá ");
        System.out.println(nome);
        System.out.println("Informe um número para descobrirmos o dobro dele");
        n1 = input.nextInt();
        dobro = n1 * 2;
        System.out.print("O dobro de ");
        System.out.print(n1);
        System.out.print(" é: ");
        System.out.println(dobro);
    }
}
