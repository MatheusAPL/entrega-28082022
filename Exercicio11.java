import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) throws IOException {

        Scanner i = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.000");
        int R;
        double pi, VOLUME;

        pi = 3.14159;
        R = i.nextInt();

        VOLUME = (4/3.0) * pi * Math.pow(R,3);
        System.out.println("VOLUME = " + f.format(VOLUME));

    }
}
