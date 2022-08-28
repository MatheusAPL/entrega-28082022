import java.io.IOException;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) throws IOException {
        Scanner u = new Scanner(System.in);
        int v = u.nextInt();
        int v1 = u.nextInt();
        int v2 = u.nextInt();
        if (v > v1 && v > v2) {
            System.out.println(v + " eh o maior");
        } else if (v1 > v2) {
            System.out.println(v1 + " eh o maior");
        } else {
            System.out.println(v2 + " eh o maior");
        }
    }

}

