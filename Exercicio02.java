import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double raio, area;
        Scanner i = new Scanner(System.in);
        raio = i.nextDouble();
        area = 3.14159 * (raio * raio);
        System.out.printf("A = %.4f\n", area);

    }
}