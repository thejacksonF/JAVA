import java.util.Scanner;

public class zPrincipal {
    public static void main(String[] args) {
        
       Juego obJuego= new Juego();
       obJuego.Piedra_papel_o_tijera();

      Nombres objNombres = new Nombres();
       objNombres.lista_de_nombres_de_los_estudiantes();

       Promedio objPromedio = new Promedio();
        objPromedio.lista_de_calificaciones();

        UserData objUserData = new UserData();
        String fullName = objUserData.NombreyApellido("Francisco", "Avitia");
        System.out.println(fullName);


      //la creacion de un objeto:
        StudentsGrades objStudentsGrades = new StudentsGrades();
        int partialGrade= objStudentsGrades.calculatePartialGrade(85,90);
        System.out.println(partialGrade);


        int finalGrade = objStudentsGrades.calculateFinalGrade (80,75,90,95);
        System.out.println(finalGrade);


        String percentageOfAbsences = objStudentsGrades.checkFailureByAbsences(64,7);
        System.out.println(percentageOfAbsences);


        Scanner objScanner = new Scanner(System.in) ;
        
        System.out.print("Dame el valor de la area: ");
        double base = objScanner.nextDouble();

        System.out.print("Dame el valor de la altura: ");
        double height = objScanner.nextDouble();

        TriangleArea objTriangleArea = new TriangleArea();
        double area = objTriangleArea.CalculateTriangleArea(base, height);
        System.out.println("El area del triangulo es: " + area);

        objScanner.close();







        


    } 

}
