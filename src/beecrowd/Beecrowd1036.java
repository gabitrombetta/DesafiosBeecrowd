package beecrowd;

import java.util.Scanner;

public class Beecrowd1036 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if ((a == 0) || (delta < 0)) {
            System.out.println("Impossivel calcular");
        } else {
            double r1 = ((-1 * b + Math.sqrt(delta)) / (2 * a));
            double r2 = ((-1 * b - Math.sqrt(delta)) / (2 * a));
            System.out.println(String.format("R1 = %.5f", r1));
            System.out.println(String.format("R2 = %.5f", r2));
        }
    }
}
