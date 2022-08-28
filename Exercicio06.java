import java.io.IOException;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) throws IOException {
        Scanner u = new Scanner(System.in);
        double A = u.nextDouble();
        double B = u.nextDouble();
        double C = u.nextDouble();
        double media = ((2 * A) + (3 * B) + (5 * C))/11;
        System.out.println(String.format("MEDIA = %.5f" , media));
    }

}
