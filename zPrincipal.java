//import java.util.Scanner;

public class zPrincipal {
    public static void main(String[] args) {
        /*
        //CLASE JUEGO
        Juego obJuego= new Juego();
        obJuego.Piedra_papel_o_tijera();
        //CLASE NOMBRES
        Nombres objNombres = new Nombres();
        objNombres.lista_de_nombres_de_los_estudiantes();

        //CLASE PROMEDIO
        Promedio objPromedio = new Promedio();
        objPromedio.lista_de_calificaciones();

        //CLASE USERDATA
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

        //Objeto del TriangleArea
        // Scanner objScanner = new Scanner(System.in) ;
        //System.out.print("Dame el valor de la area: ");
        //double base = objScanner.nextDouble();

        // System.out.print("Dame el valor de la altura: ");
        //double height = objScanner.nextDouble();

        // TriangleArea objTriangleArea = new TriangleArea();
        //double area = objTriangleArea.CalculateTriangleArea(base, height);
        //System.out.println(String.format("El area del triangulo es: %f", area));

        //objScanner.close();

        //Objeto del CirculeArea

        MultidimensionalArray objMultidimensionalArray = new MultidimensionalArray();
        objMultidimensionalArray.printbidimensionalArray();

        ExcerciseNumberType objExcerciseNumberType = new ExcerciseNumberType();
        objExcerciseNumberType.CalculateOddOrEven();

        ProgrammingLanguages objArrayListExample = new ProgrammingLanguages();
        objArrayListExample.ShowProgrammingLenguages();

        ApprovedOrNot objApprovedOrNot = new ApprovedOrNot();
        objApprovedOrNot.CheckApprovalByGrades();

        Matrix objMatrix = new Matrix();
        objMatrix.CalculateMatrix();

        //cosa del partial grade del examen 

        Scanner objScanner2 = new Scanner(System.in);

        System.out.print("Dame las califas del examen: ");
        double partialGrade2 = objScanner2.nextDouble();

        System.out.print("Dame las califas de tareas: ");
        double homeworkGrade2 = objScanner2.nextDouble();

        GradeCalculationPartial gradeCalculation = new GradeCalculationPartial();
        double finalGrade2 = gradeCalculation.gradeCalculationPartial2(partialGrade2, homeworkGrade2);

        System.out.println(String.format("Calificación final: %.1f", finalGrade2));

        objScanner2.close();
        */



        SelectionSort objSelectionSort = new SelectionSort();
        int operaciones = objSelectionSort.selectionSort(objSelectionSort.arrayWorstSelectionCase);
        System.out.println("operaciones de selection :) --> " + operaciones);


        for (int i = 0; i < objSelectionSort.arrayWorstSelectionCase.length; i++) {
            System.out.print(objSelectionSort.arrayWorstSelectionCase[i] + " ");
        }
        
    }
}