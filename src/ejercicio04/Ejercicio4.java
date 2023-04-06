/*
 * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos para
 * luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos
 * prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
 * Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15%
 * Primer Integrador 25%
 * Segundo integrador 50%
 * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores necesitan obtener
 * por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al
 * 7 de sus notas del curso.
 */
package ejercicio04;

public class Ejercicio4 {

    public static void main(String[] args) {
        double[] vec = new double[10];
        int aprobados = 0;
        int desaprobados = 0;
        double nota;
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingresa la nota " + (j + 1) + " del alumno " + (i + 1));
                nota = ((double) (Math.random() * 11));
                vec[i] += nota;
                System.out.println(String.format("[%.2f]", nota));
            }
            vec[i] /= 4;
            System.out.print("El promedio del alumno " + (i + 1) + " es de " + String.format("[%.2f]", vec[i]) + " ");
            if (vec[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);
    }
}
