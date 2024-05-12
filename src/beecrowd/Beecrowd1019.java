package beecrowd;

import java.util.Scanner;

public class Beecrowd1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int duracaoSegundos = input.nextInt();

        int horas = duracaoSegundos / 3600;
        int minutos = (duracaoSegundos % 3600) / 60;
        int segundos = duracaoSegundos % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
