package iniciante.ex1016;

import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int distancia = scan.nextInt();

        int tempoTomarDistancia = distancia*2;

        System.out.print(tempoTomarDistancia+" minutos\n");
    }
}
