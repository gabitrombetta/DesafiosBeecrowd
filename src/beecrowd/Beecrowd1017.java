package beecrowd;

import java.util.Scanner;

public class Beecrowd1017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tempoGasto = input.nextInt();
        int velocidadeMedia = input.nextInt();

        double distancia = tempoGasto * velocidadeMedia;

        double consumo = distancia / 12;

        System.out.printf("%.3f", consumo);
    }
}
