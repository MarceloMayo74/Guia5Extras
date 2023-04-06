/*
 * Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
 * Después haremos otra función o procedimiento que imprima el vector.
 */
package ejercicio03;

public class Ejercicio3 {

    public static void main(String[] args) {
        int[] vec = new int[(int) Math.round(Math.random() * 100)];
        rellenarVector(vec);
        imprimirVector(vec);
    }

    public static void rellenarVector(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) Math.round(Math.random() * 100);
        }
    }

    public static void imprimirVector(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " - ");
        }
    }
}
