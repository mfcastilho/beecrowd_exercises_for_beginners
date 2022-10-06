package iniciante.ex1019;

import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {

        int N = new Scanner(System.in).nextInt();

        int horas = N / 3600;
        N = N - (horas * 3600);

        int minutos = N / 60;
        N = N -(minutos*60);

        int segundos = N;

        System.out.println(horas+":"+minutos+":"+segundos);


    }


}
