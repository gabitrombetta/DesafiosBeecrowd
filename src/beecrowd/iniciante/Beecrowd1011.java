package beecrowd.iniciante;

import java.util.Scanner;

public class Beecrowd1011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();

        double volume = (4.0/3) * 3.14159 * Math.pow(raio, 3);

        System.out.println(String.format("VOLUME = %.3f", volume));
    }
}
