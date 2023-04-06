/*
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
 */
package ejercicio01;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del vector:");
        int n = sc.nextInt();
        int[] vec = new int[n];
        int total = 0;
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Ingresa los numeros");
            vec[i] = sc.nextInt();
            total += vec[i];
        }
        System.out.println("la suma total es:" + total);
    }
}
