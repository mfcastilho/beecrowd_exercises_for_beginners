package iniciante.ex1020;

import java.io.IOException;
import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int idadeDias = scan.nextInt();

        int anos = idadeDias/365;
        int meses = (idadeDias % 365)/30;
        int dias = (idadeDias % 365) % 30;

        System.out.println(anos+" ano(s)\n"+meses+" mes(es)\n"+dias+" dia(s)");

    }
}
