package com.company;

import java.util.Scanner;

public class Ejercicio2 {

    public static boolean esMultiplo(int num, int multiploDe) {
        return num % multiploDe == 0;
    }

    public static int[] obtenerMultiplos(int cant, int multiploDe) {
        int multiplos[] = new int[cant];
        int i = 0;
        int num = 1;
        while (i < cant) {
            if (esMultiplo(num, multiploDe)) {
                multiplos[i] = num;
                i++;
            }
            num++;
        }

        return multiplos;
    }

    public static void imprimirMultiplos(int[] multiplos, int cant) {
        for (int i = 0; i < cant; ++i) {
            System.out.println(multiplos[i]);
        }
    }

    /*
    * Desarrollar un programa para mostrar los primeros n múltiplos de m,
    * siendo n y m valores que el usuario ingresará por consola.
    * Recordá que un número a es múltiplo de b si a es divisible por b.
    * */
    public static void main(String[] args) {
        System.out.println("Ejercicio 2");

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;

        System.out.print("Introduzca la cantidad de múltiplos a mostrar: ");
        n = scanner.nextInt();
        System.out.print("Introduzca el número del cual serán múltiplos: ");
        m = scanner.nextInt();

        int multiplos[] = obtenerMultiplos(n, m);

        imprimirMultiplos(multiplos, n);
    }

}
