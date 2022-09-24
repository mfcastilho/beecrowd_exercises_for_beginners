package iniciante.ex1006;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double a = scan.nextDouble(); scan.nextLine();
        double b = scan.nextDouble(); scan.nextLine();
        double c = scan.nextDouble();

        double pesoA = 2;
        double pesoB = 3;
        double pesoC = 5;

        double weightedAverage = ((pesoA*a) + (pesoB*b) + (pesoC*c))/(pesoA+pesoB+pesoC);

        System.out.print("MEDIA = "+df.format(weightedAverage)+"\n");

    }
}
