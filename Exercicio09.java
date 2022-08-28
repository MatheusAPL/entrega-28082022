import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) throws IOException {

        Scanner u = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");
        String NOME;
        double SALARIO, VENDAS, TOTAL;

        NOME = u.next();
        SALARIO = u.nextDouble();
        VENDAS = u.nextDouble();

        TOTAL = SALARIO + VENDAS * 0.15;
        System.out.println("TOTAL = R$ " + f.format(TOTAL));

    }
}
