package com.company.clase1.TM;

import java.util.Scanner;

public class Ejercicio3 {

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

    /*
    * Desarrollar un programa para informar si un número n es primo o no,
    * siendo n un valor que el usuario ingresará por consola.
    * Recordá que un número es primo cuando sólo es divisible por sí mismo y por 1.
    * */
    public static void main(String[] args) {
        System.out.println("Ejercicio 3");
        System.out.println("Si desea finalizar ingrese -1");

        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while (n != -1) {
            System.out.print("Introduzca un número: ");
            n = scanner.nextInt();

            String respuesta = "El número ingresado ";
            respuesta += esPrimo(n) ? "es primo" : "no es primo";

            System.out.println(respuesta);
        }
    }

}
