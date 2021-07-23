package com.company.clase1;

import java.util.Scanner;

public class Ejercicio4 {

    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirPrimos(int cant) {
        int primos = 0;
        int i = 0;
        while (primos < cant) {
            if (esPrimo(i)) {
                System.out.println(i);
                primos ++;
            }
            i ++;
        }
    }

    /*
    * Desarrollar un programa para mostrar por consola los
    * primeros n números primos, siendo n un valor que
    * el usuario ingresará por consola.
    * */
    public static void main(String[] args) {
        System.out.println("Ejercicio 4");

        Scanner scanner = new Scanner(System.in);
        int cant = 0;

        System.out.print("¿Cuántos primos quiere? ");
        cant = scanner.nextInt();

        imprimirPrimos(cant);
    }

}
