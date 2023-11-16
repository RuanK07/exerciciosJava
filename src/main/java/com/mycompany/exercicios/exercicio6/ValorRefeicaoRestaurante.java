package com.mycompany.exercicios.exercicio6;

/**
 *
 * @author ruank
 */
import java.util.Scanner;

public class ValorRefeicaoRestaurante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o peso do prato montado pelo cliente (em quilos): ");
        double pesoPrato = input.nextDouble();

        double valorAPagar = pesoPrato * 12.00;

        System.out.println("O valor a pagar é: R$ " + valorAPagar);

        input.close();
    }
}