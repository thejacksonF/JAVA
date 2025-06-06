public class Promedio {

    public void lista_de_calificaciones() {
        int [] calificaciones = new int[6];
            calificaciones [0] =90;
            calificaciones [1]=85;
            calificaciones [2]=96;
            calificaciones [3]=78;
            calificaciones [4]=88;
            calificaciones [5]=95;

        int suma =0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];


            int promedio = suma / calificaciones.length;

            System.out.println(promedio);
    
        }
    }
}
