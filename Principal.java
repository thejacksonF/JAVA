

public class Principal {
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


    } 

}
