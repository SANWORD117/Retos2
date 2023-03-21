import java.util.Scanner;
import java.util.Random;

public class Reto4 {
    public static void main(String[] args) {
        int tamaño, filas = 0, columnas = 0, sumaF = 0, sumaC = 0;

        Scanner Sudoku = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del Sudoku (MAX 9): ");
        tamaño = Sudoku.nextInt();

        filas = tamaño;
        columnas = tamaño;

        int [][]sudoku = new int [filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Random numeros = new Random();
                int num = numeros.nextInt(tamaño);
                num+= 1;
                sudoku [i][j] = num;
                
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                
                System.out.print(sudoku[i][j] + "\t");

            }
            System.out.println(" ");
        }

        for (int i = 0; i < filas; i++) {
            sumaF = 0;
            sumaC = 0;
            for (int j = 0; j < columnas; j++) {

                sumaF+= sudoku[i][j];
                sumaC+= sudoku[j][i];
            }

            System.out.println("Suma de la Fila " + (i+1) + " es de: " + sumaF);
            System.out.println("Suma de la Columna " + (i+1) + " es de: " + sumaC);
        }

        System.out.println("Gracias por usar mi Software ^_^");
        Sudoku.close();
    }
}
