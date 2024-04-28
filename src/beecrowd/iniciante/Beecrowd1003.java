package beecrowd.iniciante;

import java.util.Scanner;

public class Beecrowd1003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();

        int soma = a + b;

        System.out.println(String.format("SOMA = %d", soma));
    }
}
