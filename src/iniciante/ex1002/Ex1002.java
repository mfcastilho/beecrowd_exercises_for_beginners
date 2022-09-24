package iniciante.ex1002;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "us"));
        Scanner scan = new Scanner(System.in);
        double n = 3.14159;
        Double raio = scan.nextDouble();
        DecimalFormat df = new DecimalFormat("0.0000");

        double area = n*(Math.pow(raio,2));

        System.out.println("A="+df.format(area)+".\n");
        scan.close();

    }
}
