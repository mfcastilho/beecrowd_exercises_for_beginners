package iniciante.ex1020;

import java.util.Scanner;

public class Ex1020_Solucao2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int idadeDias = scan.nextInt();
        int ano = 365;
        int mes = 30;

        int contador = 0;

        int totAnos = 0;
        int totMeses = 0;
        int totDias = 0;

        for(var i = 0; i<= idadeDias; i++){
            if(contador == ano){
                totAnos++;
                contador = 0;
            }
           contador++;
        }

        idadeDias = idadeDias-(totAnos*ano);


        contador = 0;
        for(var i = 0; i<= idadeDias; i++){
            if(contador == mes){
                totMeses++;
                contador = 0;
            }
            contador++;
        }

        idadeDias = idadeDias - (totMeses*mes);

        for(var i = 0; i< idadeDias; i++){
                totDias++;
        }

        System.out.println(totAnos+" ano (s)\n"+totMeses+" mes (es)\n"+totDias+" dia (s)");
    }
}
