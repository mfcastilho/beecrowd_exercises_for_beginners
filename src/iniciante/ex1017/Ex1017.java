package iniciante.ex1017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        int tempoGastoViagem = scan.nextInt();
        int velocidadeMedia = scan.nextInt();

        double distanciaPercorrida = velocidadeMedia * tempoGastoViagem;

        double litrosNecessarios = distanciaPercorrida /12;

        System.out.print(df.format(litrosNecessarios)+"\n");

    }
}
