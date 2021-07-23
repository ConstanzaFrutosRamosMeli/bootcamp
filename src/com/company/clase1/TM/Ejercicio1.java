package com.company.clase1.TM;

import java.util.Scanner;

public class Ejercicio1 {

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static void imprimirNNumerosPares(int n) {
        for (int i = 1; i <= n; ++i) {
            if (esPar(i)) {
                System.out.println(i);
            }
        }
    }

    /*
    * Desarrollar un programa para mostrar los primeros n números pares,
    * siendo n un valor que el usuario ingresará por consola.
    * Recordá que un número es par cuando es divisible por 2.
    */
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");

        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.print("Introduzca el valor de n: ");
        n = scanner.nextInt();

        imprimirNNumerosPares(n);
    }

}
