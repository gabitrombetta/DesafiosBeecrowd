package beecrowd.iniciante;

import java.util.Scanner;

public class Beecrowd1020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idadeDias = input.nextInt();

        int idadeAnos = idadeDias / 365;
        idadeDias %= 365;
        int idadeMeses = idadeDias / 30;
        idadeDias %= 30;

        System.out.println(idadeAnos + " ano(s)");
        System.out.println(idadeMeses + " mes(es)");
        System.out.println(idadeDias + " dia(s)");
    }
}
