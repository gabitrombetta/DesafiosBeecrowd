package beecrowd.iniciante;

import java.util.Scanner;

public class Beecrowd1002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double raio = entrada.nextDouble();

        double area = 3.14159 * Math.pow(raio, 2);

        System.out.println(String.format("A=%.4f", area));
    }
}
