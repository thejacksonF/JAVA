import java.util.Scanner;

public class StudentsGradesManual {

    public void GiveGradesAndCalculateThem() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la calificación del examen parcial (0-100): ");
        double calificacionExamen = scanner.nextDouble();
        
        System.out.print("Ingresa la calificación de las tareas (0-100): ");
        double calificacionTareas = scanner.nextDouble();
        
        double calificacionTotal = (calificacionExamen * 0.7) + (calificacionTareas * 0.3);
        
        System.out.printf("La calificación total es: %.2f%n", calificacionTotal);
        
        scanner.close();
    }
}






  
