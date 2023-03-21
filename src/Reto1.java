import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {

        int numEstudiantes = 0, respuesta = 1;

        double [] definitiva = new double[100];
        double [] promedio = new double[100];
        double [] notas = new double[100];

        String [] estudiantes = new String[30];
        String estudiante;

        Scanner asignatura = new Scanner(System.in);

        System.out.println("BIENVENIDO PROFESOR");
        System.out.print("Ingrese el nombre del profesor que evaluara la asignatura: ");
        String profesor = asignatura.next();

        while (respuesta == 1) {

            System.out.print("Ingrese el nombre del estudiante: ");
            estudiante = asignatura.next();

            double suma = 0;

            for (int i = 0; i < 3; i++) {

                System.out.print("Ingresa la nota " + (i+1) + " del estudiante: ");
                notas[numEstudiantes * 3 + i] = asignatura.nextDouble();
                suma += notas[numEstudiantes * 3 + i];

            }

            promedio[numEstudiantes] = suma / 3.0;
            definitiva[numEstudiantes] = promedio[numEstudiantes];
            estudiantes[numEstudiantes] = estudiante;

            numEstudiantes++;

            System.out.println("¿Desea evaluar otro estudiante? (1. SI / 2. NO) ");
            respuesta = asignatura.nextInt();

        }

        for (int i = 0; i < numEstudiantes; i++) {

            System.out.println("Profesor evaluador: " + profesor);
            System.out.println("Estudiante: " + estudiantes[i]);
            System.out.println("Definitiva: " + definitiva[i]);

            if (definitiva[i] < 3.0) {

                System.out.println("Reprobaste la asignatura");
                
            } else if (definitiva[i] == 3.0) {

                System.out.println("Pasaste raspando la asignatura");

            } else {

                System.out.println("Aprobaste la materia, ¡Enhorabuena!");

            }
        }

        asignatura.close();
    }
}
