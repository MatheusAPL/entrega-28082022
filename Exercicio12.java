import java.io.IOException;
import java.util.Scanner;

public class Exercicio12 {
        public static void main(String[] args) throws IOException {
        Scanner u = new Scanner(System.in);
        double A = u.nextDouble();
        double B = u.nextDouble();
        double C = u.nextDouble();
        double triangulo = A * C / 2.0;
        double circulo = 3.14159 * (C * C);
        double trapezio = ((A + B) * C) / 2;
        double quadrado = B * B;
        double retangulo = A * B;
        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        System.out.println(String.format("CIRCULO: %.3f", circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        System.out.println(String.format("RETANGULO: %.3f", retangulo));
        }

}
