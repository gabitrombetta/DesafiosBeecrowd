package beecrowd.iniciante;

import java.util.Scanner;

public class Beecrowd1004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();

        int prod = a * b;

        System.out.println(String.format("PROD = %d", prod));
    }
}
