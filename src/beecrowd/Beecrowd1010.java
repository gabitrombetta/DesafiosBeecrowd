package beecrowd;

import java.util.Scanner;

public class Beecrowd1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peca1[];
        peca1 = new double[3];

        peca1[0] = input.nextDouble();
        peca1[1] = input.nextDouble();
        peca1[2] = input.nextDouble();

        double peca2[];
        peca2 = new double[3];

        peca2[0] = input.nextDouble();
        peca2[1] = input.nextDouble();
        peca2[2] = input.nextDouble();

        double total = (peca1[1] * peca1[2]) + (peca2[1] * peca2[2]);

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));

    }
}
