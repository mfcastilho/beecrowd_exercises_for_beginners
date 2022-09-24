package iniciante.ex1009;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String nomeVendedor = scan.nextLine();
        double salarioFixo = scan.nextDouble();scan.nextLine();
        double totVendasMes = scan.nextDouble();

        double porcentagemComissao = 0.15;
        double valorComissao = totVendasMes * porcentagemComissao;
        double total_aReceber = salarioFixo+valorComissao;

        System.out.print("TOTAL = R$ "+df.format(total_aReceber)+"\n");

    }
}
