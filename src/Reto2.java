import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        
        int nadadores = 10;

        Scanner competencia_n = new Scanner(System.in);

        String nom_nadadores[] = new String [nadadores];
        String premio[] = new String [nadadores];
        String ape_nadadores[] = new String [nadadores];
        String pais[] = new String [nadadores];
        int puesto[] = new int [nadadores];
        int puntos[] = new int [nadadores];
        double tiempo[] = new double [nadadores];

        System.out.println("BIENVENIDOS A LA COMPETENCIA DE NATACIÖN ESTILO LIBRE");

        System.out.println("Participan: " + nadadores + " nadadores");
        for (int i = 0; i < nadadores; i++) {

            System.out.println("Clasificación de los 10 nadadores hombres");
            System.out.println("Ingrese el puesto del 1 al 10 de clasificación: ");
            puesto[i] = competencia_n.nextInt();
            System.out.println("Ingrese el primer nombre del participante: ");
            nom_nadadores[i] = competencia_n.next();
            System.out.println("Ingrese el primer apellido del participante: ");
            ape_nadadores[i] = competencia_n.next();
            System.out.println("Ingrese el pais del participante: ");
            pais[i] = competencia_n.next();
            System.out.println("Ingrese el tiempo que recorrió el participante: ");
            tiempo[i] = competencia_n.nextDouble();
            System.out.println("Ingrese la cantidad de puntos que obtuvo el participante: ");
            puntos[i] = competencia_n.nextInt();
            System.out.println("Ingrese el Premio ganado: ");
            premio[i] = competencia_n.next();

        } 
        for (int i = 0; i < nadadores; i++) {
            
            System.out.println("Top "+ puesto[i] + " : " + nom_nadadores[i] + " " + ape_nadadores[i] + " del pais " + pais[i] + " realizó un recorrido de: " + tiempo[i] + " segundos");
            System.out.println("Puntos obtenidos de la Modalidad: " + puntos[i]);
            System.out.println("Premio: " + premio[i]);

        }
        competencia_n.close();
    }
}