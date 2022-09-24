package iniciante.ex1011;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
         double pi = 3.14159;
         double raio = scan.nextDouble();

         double volume = (4.0/3) * pi * (Math.pow(raio,3));

        System.out.print("VOLUME = "+df.format(volume)+"\n");

    }
}
