public class ApprovedOrNot {

    public void CheckApprovalByGrades() {
        int [] gradesOfAll ={
            100,70,50,80,60,70,
            80,99,65,90,45,80,65,
            78,93,58,70,69,10,73        
        };

        int approved = 0;
        int notApproved = 0;



        for (int grade : gradesOfAll) {
            if (grade>= 70) approved++;
                else notApproved++;
        }
        System.out.println("cantidad de aprobados:" + approved);
        System.out.println("cantidad de reprobados: " +notApproved);

    }








}