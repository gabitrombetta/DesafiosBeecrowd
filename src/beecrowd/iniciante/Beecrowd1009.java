package beecrowd.iniciante;

import java.util.Scanner;

public class Beecrowd1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        double salarioFixo = input.nextDouble();
        double totalVendas = input.nextDouble();

        double total = salarioFixo + (totalVendas * 0.15);

        System.out.println(String.format("TOTAL = R$ %.2f", total));
    }
}
