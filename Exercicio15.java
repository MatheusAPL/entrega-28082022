import java.io.IOException;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) throws IOException {
        Scanner u = new Scanner(System.in);
        double x1 = u.nextDouble();
        double y1 = u.nextDouble();
        double x2 = u.nextDouble();
        double y2 = u.nextDouble();
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(String.format("%.4f", distancia));
    }

}
