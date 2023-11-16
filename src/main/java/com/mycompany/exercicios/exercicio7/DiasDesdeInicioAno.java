package com.mycompany.exercicios.exercicio7;

/**
 *
 * @author ruank
 */
import java.util.Scanner;

public class DiasDesdeInicioAno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o dia: ");
        int dia = input.nextInt();

        System.out.println("Informe o mês: ");
        int mes = input.nextInt();

        int diasPassados = (mes - 1) * 30 + dia;

        System.out.println("Desde o início do ano se passaram " + diasPassados + " dias.");

        input.close();
    }
}