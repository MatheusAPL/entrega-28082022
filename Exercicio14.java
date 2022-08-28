import java.io.IOException;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) throws IOException {
            Scanner u = new Scanner(System.in);
            int X = u.nextInt();
            double Y = u.nextDouble();
            double media = X / Y;
            System.out.println(String.format("%.3f km/l", media));
        }

}

