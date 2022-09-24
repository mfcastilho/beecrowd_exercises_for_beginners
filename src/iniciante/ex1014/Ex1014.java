package iniciante.ex1014;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        int x = scan.nextInt();
        double y = scan.nextDouble();

        double consumoMedio = x/y;

        System.out.print(df.format(consumoMedio)+" km/l\n");

    }
}
