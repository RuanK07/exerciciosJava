package com.mycompany.exercicios.exercicio5;

/**
 *
 * @author ruank
 */
import java.util.Scanner;

public class QuantidadeLitrosGasolina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor pago pelo motorista: ");
        double valorPago = input.nextDouble();

        System.out.println("Informe o preço do litro de gasolina: ");
        double precoLitro = input.nextDouble();

        double litrosObtidos = valorPago / precoLitro;

        System.out.println("O motorista conseguiu colocar " + litrosObtidos + " litros no tanque.");

        input.close();
    }
}