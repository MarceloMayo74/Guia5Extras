/*
 * Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */
package ejercicio05;

public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Ingrese la dimensión de filas y columnas de la matriz");
        int n = ((int) Math.round(Math.random() * 10));
        System.out.println(n + " filas");
        int m = ((int) Math.round(Math.random() * 10));
        System.out.println(m + " columnas");
        int[][] matriz = new int[n][m];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                suma += matriz[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("La suma de todos sus elementos es de " + suma);
    }
}
