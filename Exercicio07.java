import java.io.IOException;
import java.util.Scanner;

public class Exercicio07 {
        public static void main(String[] args) throws IOException {
        Scanner u = new Scanner(System.in);
        int A = u.nextInt();
        int B = u.nextInt();
        int C = u.nextInt();
        int D = u.nextInt();
        int diferença = A * B - C * D;
        System.out.println("DIFERENÇA = " + diferença);
        }

}
