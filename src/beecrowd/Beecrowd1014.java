package beecrowd;

import java.util.Scanner;

public class Beecrowd1014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        double y = input.nextDouble();

        double consumo = x / y;

        System.out.printf("%.3f km/l", consumo);
    }
}
