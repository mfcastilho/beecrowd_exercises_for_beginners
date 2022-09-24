package iniciante.ex1010;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int codProduto1 = scan.nextInt();
        int totProduto1 = scan.nextInt();
        double valorUnitarioProduto1 = scan.nextDouble();

        int codProduto2 = scan.nextInt();
        int totProduto2 = scan.nextInt();
        double valorUnitarioProduto2 = scan.nextDouble();

        double valorPagar = (totProduto1 * valorUnitarioProduto1) + (totProduto2 * valorUnitarioProduto2);

        System.out.print("VALOR A PAGAR: R$ "+df.format(valorPagar)+"\n");
    }
}
