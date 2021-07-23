package com.company.clase1;

import java.util.Scanner;

public class Ejercicio5 {

    public static int obtenerCantidadDigitos(int numero, int digito) {
        int cantidad = 0;
        while(numero > 0){
            int aux = numero % 10;
            if (aux == digito) {
                cantidad ++;
            }
            numero = numero / 10;
        }

        return cantidad;
    }

    public static void imprimirNumeros(int cantNumeros, int cantDigitos, int digito) {
        int _cantNumeros = 0;
        int i = 0;
        while (_cantNumeros < cantNumeros) {
            if (cantDigitos == obtenerCantidadDigitos(i, digito)) {
                _cantNumeros ++;
                System.out.println(i);
            }
            i++;
        }
    }

    /*
    * Desarrollar un programa para mostrar por consola los primeros n
    * números naturales que tienen al menos m dígitos d, siendo n, m y d
    * valores que el usuario ingresará por consola.
    * Por ejemplo: si el usuario ingresa n=5, m=2 y d=3,
    * el programa deberá mostrar por consola los primeros 5
    * números naturales que tienen, al menos, 2 dígitos 3.
    * En este caso la salida será: 33, 133, 233, 303, 313.
    * Según cómo decidas encarar la solución de este ejercicio,
    * es probable que necesites utilizar recursos que aún no
    * hemos estudiado. El desafío consiste en googlear cómo
    * utilizar dichos recursos y ¡utilizarlos!
    * */
    public static void main(String[] args) {
        System.out.println("Ejercicio 5");

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;
        int d = 0;

        System.out.print("Ingrese la cantidad de números naturales: ");
        n = scanner.nextInt();
        System.out.print("Ingrese la cantidad de números dígitos: ");
        m = scanner.nextInt();
        System.out.print("Ingrese el dígito: ");
        d = scanner.nextInt();

        imprimirNumeros(n, m, d);
    }

}
