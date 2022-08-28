import java.io.IOException;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) throws IOException {
        Scanner u = new Scanner(System.in);
        double A = u.nextDouble();
        double B = u.nextDouble();
        double media = ((3.5 * A) + (7.5 * B))/11;
        System.out.println(String.format("MEDIA = %.5f" , media));
    }

}
