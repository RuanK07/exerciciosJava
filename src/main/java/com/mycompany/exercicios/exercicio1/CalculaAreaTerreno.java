package com.mycompany.exercicios.exercicio1;

/**
 *
 * @author ruank
 */
import java.util.Scanner;

public class CalculaAreaTerreno {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a largura do terreno: ");
        double largura = input.nextDouble();

        System.out.println("Informe o comprimento do terreno: ");
        double comprimento = input.nextDouble();

        double area = largura * comprimento;

        System.out.println("A área do terreno é: " + area);
        
        input.close();
    }
}