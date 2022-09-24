package iniciante.ex1008;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int numFuncionario = scan.nextInt(); scan.nextLine();
        int horasTrabalhadas = scan.nextInt(); scan.nextLine();
        double valorHoraTrabalhada = scan.nextDouble();

        double salarioFuncionario = horasTrabalhadas*valorHoraTrabalhada;

        System.out.println("NUMBER = "+numFuncionario);
        System.out.print("SALARY = U$ "+df.format(salarioFuncionario)+"\n");
    }
}
