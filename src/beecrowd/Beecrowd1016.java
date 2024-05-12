package beecrowd;

import java.util.Scanner;

public class Beecrowd1016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distancia = input.nextInt();

        int tempo = (60 * distancia) / 30;

        System.out.println(tempo + " minutos");
    }
}
