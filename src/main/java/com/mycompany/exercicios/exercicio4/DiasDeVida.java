package com.mycompany.exercicios.exercicio4;

/**
 *
 * @author ruank
 */
import java.util.Scanner;

public class DiasDeVida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o nome da pessoa: ");
        String nome = input.nextLine();

        System.out.println("Informe a idade da pessoa: ");
        int idade = input.nextInt();

        int diasDeVida = idade * 365;

        System.out.println(nome + ", você já viveu " + diasDeVida + " dias.");
        
        input.close();
    }
}