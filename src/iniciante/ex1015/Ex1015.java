package iniciante.ex1015;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        double p1X = scan.nextDouble();
        double p1Y = scan.nextDouble();

        double p2X = scan.nextDouble();
        double p2Y = scan.nextDouble();

        double distancia = Math.sqrt(Math.pow((p2X - p1X),2) + Math.pow((p2Y - p1Y),2));

        System.out.print(df.format(distancia)+"\n");
    }
}
