package beecrowd;

import java.util.Scanner;

public class Beecrowd1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int horasTrabalhadas = input.nextInt();
        double valorPorHora = input.nextDouble();

        double salary = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + number);
        System.out.println(String.format("SALARY = U$ %.2f", salary));
    }
}
