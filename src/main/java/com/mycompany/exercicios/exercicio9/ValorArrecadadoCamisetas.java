package com.mycompany.exercicios.exercicio9;

/**
 *
 * @author ruank
 */
import java.util.Scanner;

public class ValorArrecadadoCamisetas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de camisetas pequenas vendidas: ");
        int qtdPequenas = input.nextInt();

        System.out.println("Informe a quantidade de camisetas médias vendidas: ");
        int qtdMedias = input.nextInt();

        System.out.println("Informe a quantidade de camisetas grandes vendidas: ");
        int qtdGrandes = input.nextInt();

        double valorArrecadado = (qtdPequenas * 10) + (qtdMedias * 12) + (qtdGrandes * 15);

        System.out.println("O valor arrecadado é: R$ " + valorArrecadado);

        input.close();
    }
}