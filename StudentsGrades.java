
public class StudentsGrades {
    public int calculatePartialGrade (int examScore, int homeworkScore) {
     
        double partialGrade = ( examScore * 0.7 +homeworkScore *0.3);
        return (int)(partialGrade);
    }


    public int calculateFinalGrade (int firstPartial, int secondPartial, int thirdPartial ) {
        double finalGrade=((firstPartial + secondPartial + thirdPartial));

        return (int)(finalGrade);
    }


}






















//public class StudentsGrades {
    //public static void main(int[] args) {
        //StudentsGrades student = new StudentsGrades();
        
        // Calcular la calificación del parcial
       // int partialGrade = student.calculatePartialGrade(85, 90);
        //System.out.println("Calificación del parcial: " + partialGrade);
        
        // Calcular la calificación final del semestre
        //int finalGrade = student.calculateFinalGrade(80, 75, 90, 85);
        //System.out.println("Calificación final del semestre: " + finalGrade);
        
        // Verificar el estatus de asistencia
        //int attendanceStatus = student.checkFailureByAbsences(64, 7);
        //System.out.println(attendanceStatus);
    //}
//}
    


