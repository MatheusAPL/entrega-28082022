import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) throws IOException {

        Scanner u = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");
        int c, p;
        int c1, p1;
        double v, v2, VALOR;

        c = u.nextInt();
        p = u.nextInt();
        v = u.nextDouble();
        c1 = u.nextInt();
        p1 = u.nextInt();
        v2 = u.nextDouble();

        VALOR = p * v + p1 * v2;

        System.out.println("VALOR A PAGAR: R$ " + f.format(VALOR));

    }
}
