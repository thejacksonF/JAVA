import JAVA.java4.EjemploPila;

public class MAIN3 {
    public static void main(String[] args) {
        /*
        LinkedSimpleList list = new LinkedSimpleList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("List:");
        list.display();

        System.out.println("Is 20 in the list? " + list.search(20));

        list.delete(20);

        System.out.println("After deleting 20:");
        list.display();


        EjemploCola cola = new EjemploCola();
        cola.add("Cliente 1");
        cola.add("Cliente 2");s
        cola.add("Cliente 3");
        System.out.println("Cliente al frente: " + cola.peek());
        */



        
       // EJEMPLO DE COLA

        EjemploPila pila = new EjemploPila();

        pila.push("Camarones con pollo");
        pila.push("Langosta con puré");
        pila.push("Rib-eye con puré y brócoli");
        pila.push("Spaghetti con albóndigas y salsa de tomate");
        pila.push("Plato con ensalada");
        pila.push("Tacos de carne asada con mucho limón");
        pila.push("Pollo asado con cebollas caramelizadas");

        pila.mostrarEstado();


        // multiplicacionnn

        TwoMultiplication solver = new TwoMultiplication();

        int[] lista = {2, 4, 6, 8};
        int objetivo = 16;

        int[] resultado = solver.twoMultiply(lista, objetivo);

        if (resultado.length == 2) {
            System.out.println("Índices que multiplican: [" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No se encontraron dos números cuyo producto sea " + objetivo);
        }











        
    }
}
