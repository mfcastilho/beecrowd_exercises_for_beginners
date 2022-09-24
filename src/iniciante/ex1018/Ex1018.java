package iniciante.ex1018;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        /*
        int notasInseridas = leitor.nextInt();
        int atual = notasInseridas;
        int notas100 = atual / 100;
        atual -= notas100 * 100;
        int notas50 = atual / 50;
        atual -= notas50 * 50;
        int notas20 = atual / 20;
        atual -= notas20 * 20;
        int notas10 = atual / 10;
        atual -= notas10 * 10;
        int notas5 = atual / 5;
        atual -= notas5 * 5;
        int notas2 = atual / 2;
        atual -= notas2 * 2;
        int notas1 = atual;
        */
        int valor = scan.nextInt();


        int notas100 = valor / 100;
        valor = valor - notas100 * 100;

        int notas50 = valor / 50;
        valor = valor - notas50 * 50;

        int notas20 = valor / 20;
        valor = valor - notas20 * 20;

        int notas10 = valor / 10;
        valor = valor - notas20 * 20;

        int notas5 = valor / 5;
        valor = valor - notas5 * 5;

        int notas2 = valor / 2;
        valor = valor - notas2 * 2;

        int notas1 = valor;


        System.out.println(notas100+" nota(s) de R$ 100,00");
        System.out.println(notas50+" nota(s) de R$ 50,00");
        System.out.println(notas20+" nota(s) de R$ 20,00");
        System.out.println(notas10+" nota(s) de R$ 10,00");
        System.out.println(notas5+" nota(s) de R$ 5,00");
        System.out.println(notas2+" nota(s) de R$ 2,00");
        System.out.print(notas1+" nota(s) de R$ 1,00");
    }
}
