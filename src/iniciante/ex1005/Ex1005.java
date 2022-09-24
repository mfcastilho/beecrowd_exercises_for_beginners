package iniciante.ex1005;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble(); scan.nextLine();
        double b = scan.nextDouble();

        double pesoA = 3.5;
        double pesoB = 7.5;


        double media =  ((pesoA * a) + (pesoB * b))/ (pesoA+pesoB);

        DecimalFormat df = new DecimalFormat("0.00000");

        System.out.print("MEDIA = "+df.format(media)+"\n");
    }
}
