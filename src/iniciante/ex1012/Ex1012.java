package iniciante.ex1012;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");


        double pi = 3.14159;

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double areaTrianguloRetangulo = (a*c) / 2;
        double areaCirculo = pi * (Math.pow(c,2));
        double areaTrapezio = ((a + b) * c) / 2;
        double areaQuadrado = Math.pow(b,2);
        double areaRetangulo = a * b;

        System.out.println("TRIANGULO: "+df.format(areaTrianguloRetangulo));
        System.out.println("CIRCULO: "+df.format(areaCirculo));
        System.out.println("TRAPEZIO: "+df.format(areaTrapezio));
        System.out.println("QUADRADO: "+df.format(areaQuadrado));
        System.out.print("RETANGULO: "+df.format(areaRetangulo)+"\n");

    }
}
