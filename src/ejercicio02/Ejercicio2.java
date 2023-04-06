/*
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse
 * en cuanto se detecte alguna diferencia entre los elementos).
 */
package ejercicio02;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del vector:");
        int n = sc.nextInt();
        int[] vec1 = new int[n];
        int[] vec2 = new int[n];
        for (int i = 0; i < vec1.length; i++) {
            System.out.println("Ingresa los numeros del vector 1:");
            vec1[i] = sc.nextInt();
            System.out.println("Ingresa los numeros del vector 2:");
            vec2[i] = sc.nextInt();
        }
        boolean comparacion = true;
        for (int i = 0; i < vec2.length; i++) {
            if (vec1[i] != vec2[i]) {
                comparacion = false;
            }
        }
        if (comparacion == false) {
            System.out.println("No son iguales!");
        } else {
            System.out.println("Son iguales!");
        }
    }
}
