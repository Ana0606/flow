import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double n1, n2, media;

        System.out.println("Vamos calcular a nota média de um aluno");
        System.out.println("Informe a primeira nota");
        n1 = input.nextDouble();
        System.out.println("Informe a segunda nota");
        n2 = input.nextDouble();
        media = n1 + n2 / 2;
        System.out.print("A nota média do aluno é: ");
        System.out.println(media);
    }
}
