

public class Juego {
    public void Piedra_papel_o_tijera(){

        String [] eleccion = new String[3];
        eleccion[0]="Piedra";
        eleccion[1]="Papel";
        eleccion[2]="Tijera";

        int indice_aleatorio= (int) (Math.random()*eleccion.length);

        System.out.println("COMPU: Yo escojo... " + eleccion[indice_aleatorio]);

    }

}

//ya quedo :D