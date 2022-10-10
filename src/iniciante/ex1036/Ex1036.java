package iniciante.ex1036;

import java.text.DecimalFormat;
import java.util.Scanner;

/*

Fórmula de Baskara
x = – b ± √Δ
      2a

Fórmula do Delta
 Δ = b2 – 4ac

"IMPORTANTE:o valor do coeficiente 'A' nunca é igual a 0, caso isso ocorra, a equação deixa de ser do 2º grau"
"A equação de 2º grau pode ser representada por ax²+bx+c=0, em que os coeficientes a, b e c são números reais, com a ≠ 0"

* */

public class Ex1036 {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.#####");
        double A, B, C, R1, R2, delta;

        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        delta = B*B - 4*A*C;

        if ((A == 0) | (B*B - 4*A*C < 0)) {
            System.out.println("Impossivel calcular");
        }
        else {
            R1 = (-B + Math.sqrt(delta))/(2*A);
            R2 = (-B - Math.sqrt(delta))/(2*A);
            System.out.println("R1 = " + df.format(R1));
            System.out.println("R2 = " + df.format(R2));
        }




    }
}
