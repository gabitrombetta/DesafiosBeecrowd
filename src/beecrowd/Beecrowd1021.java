package beecrowd;

import java.util.Scanner;

public class Beecrowd1021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor = input.nextDouble();

        System.out.println(valor);

        double notasCem = valor / 100; // 5
        valor %= 100; // 76
        double notasCinquenta = valor / 50; // 1
        valor %= 50; // 26
        double notasVinte = valor / 20; // 1
        valor %= 20; // 6
        double notasDez = valor / 10; // 0
        valor %= 10; // 6
        double notasCinco = valor / 5; // 1
        valor %= 5; // 1
        double notasDois = valor / 2; // 0
        valor %= 2; // 1
        double notasUm = valor / 1; // 1

        System.out.println(notasCem + " nota (s) de R$ 100,00");
        System.out.println(notasCinquenta + " nota (s) de R$ 50,00");
        System.out.println(notasVinte + " nota (s) de R$ 20,00");
        System.out.println(notasDez + " nota (s) de R$ 10,00");
        System.out.println(notasCinco + " nota (s) de R$ 5,00");
        System.out.println(notasDois + " nota (s) de R$ 2,00");
        System.out.println(notasUm + " nota (s) de R$ 1,00");
    }
}
