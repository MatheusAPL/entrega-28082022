import java.io.IOException;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) throws IOException {
        Scanner u = new Scanner(System.in);
        int funcionarios = u.nextInt();
        int horas = u.nextInt();
        double valorPorHora = u.nextDouble();
        double salario = horas * valorPorHora;
        System.out.println("NUMERO = " + funcionarios);
        System.out.println(String.format("SALARIO = U$ %.2f" , salario));
     }

}