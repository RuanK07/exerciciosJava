package com.mycompany.exercicios.exercicio8;

/**
 *
 * @author ruank
 */
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = input.nextDouble();

        double mediaPonderada = (nota1 * 1 + nota2 * 2 + nota3 * 3) / 6;

        System.out.println("A média ponderada é: " + mediaPonderada);

        input.close();
    }
}