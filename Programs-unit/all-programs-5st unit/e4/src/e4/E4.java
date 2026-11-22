package e4;

import java.util.Scanner;

//Hector Caleb Mosqueda Santes N° control:25260872
public class E4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el tamano del arreglo: ");
        int n = sc.nextInt();

       
        int[] numeros = new int[n];

        // Llamada a las funciones
        llenarArreglo(numeros, sc);

        System.out.println("\nArreglo original:");
        imprimirArreglo(numeros);

        ordenarBurbuja(numeros);

        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(numeros);

        sc.close();
    }

   
    public static void llenarArreglo(int[] arreglo, Scanner sc) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingresa el numero en la posicion [" + i + "]: ");
            arreglo[i] = sc.nextInt();
        }
    }

   
    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio;

        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambio = true;
                }
            }
            if (!intercambio) {
                break;
            }
        }
    }

 
    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}