package com.mycompany.exercicios.exercicio3;

/**
 *
 * @author ruank
 */
import java.util.Scanner;

public class VendasPadaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de pães vendidos: ");
        int qtdPães = input.nextInt();

        System.out.println("Informe a quantidade de broas vendidas: ");
        int qtdBroas = input.nextInt();

        double totalArrecadado = (qtdPães * 0.12) + (qtdBroas * 1.50);
        double poupanca = totalArrecadado * 0.10;

        System.out.println("Total arrecadado: R$ " + totalArrecadado);
        System.out.println("Valor a guardar na poupança: R$ " + poupanca);
        
        input.close();
    }
}