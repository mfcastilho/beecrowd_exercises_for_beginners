package iniciante.ex1019;

import java.util.Scanner;

public class Ex1019_Solucao2 {
    public static void main(String[] args) {
        Integer N = new Scanner(System.in).nextInt();

        int hora = 3600;
        int minuto = 60;

        int totHoras = 0;
        int totMinutos = 0;
        int totSegundos = 0;

        int contador = 0;

        for(var i = 0; i <= N; i++){
            if(contador == hora){
                totHoras++;
                contador = 0;
            }
            contador++;
        }

        N = N-(hora*totHoras);

        contador=0;
//
        for (var i = 0; i<=N;i++){
            if(contador == minuto){
                totMinutos++;
                contador = 0;
            }
            contador++;
        }
        System.out.println(totMinutos);

        N = N - (minuto*totMinutos);

        for(var i = 0; i < N; i++){
            totSegundos++;
        }

        System.out.println(totHoras+":"+totMinutos+":"+totSegundos);


    }
}
