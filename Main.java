package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        crearTablaSudoku();
    }
    public static int [][] crearTablaSudoku () {
        int [][] tablaSudoku = new int[9][9];
        Random random = new Random();
        int posicionHorizontal = 0;
        int posicionVertical = 0;
        int numDeValoresXCuadrado = 0;
        int valor = 0;
        numDeValoresXCuadrado = random.nextInt(2) + 2;
        for (int i = 0; i < numDeValoresXCuadrado; ++i) {
            posicionVertical = random.nextInt(8);
            posicionHorizontal = random.nextInt(8);
            tablaSudoku[posicionVertical][posicionHorizontal] = random.nextInt(8) + 1;
        }
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                imprimirInt(tablaSudoku[i][j]);
                imprimirText(" ");
            }
            imprimirSaltLinia();
        }
        return tablaSudoku;
    }



    public static int llegirInt () {
        Scanner lector = new Scanner(System.in);
        int valor = 0;
        valor = lector.nextInt();
        return valor;
    }
    public static void imprimirInt (int valor) {
        System.out.print(valor);
    }
    public static void imprimirSaltLinia () {
        System.out.println(" ");
    }
    public static void imprimirText (String text) {
        System.out.print(text);
    }

}