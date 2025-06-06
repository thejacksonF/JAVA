// los %s son para que imprima el nombre y apellido, es una forma imprimirlos sin usar el "+", que por ende imprimira menos recursos

public class UserData {
    
    public String NombreyApellido(String Nombre, String Apellido){

        return String.format("El nombre completo es %s %s ", Nombre, Apellido);



    }

    
}
