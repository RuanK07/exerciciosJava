package com.mycompany.exercicios.exercicio2;

/**
 *
 * @author ruank
 */
import java.util.Scanner;

public class FerradurasParaCavalos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de cavalos: ");
        int qtdCavalos = input.nextInt();

        int qtdFerraduras = qtdCavalos * 4; // Cada cavalo possui 4 ferraduras

        System.out.println("Serão necessárias " + qtdFerraduras + " ferraduras para equipar os cavalos.");
        
        input.close();
    }
}