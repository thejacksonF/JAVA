package JAVA.java4;

import java.util.LinkedList;

public class MAIN {
    public static void main(String[] args) {
        SumaDosNumeros solver = new SumaDosNumeros();

        int[] lista_de_numeros = {2, 7, 11, 15};
        int numero_para_sumar = 9;

        int[] RESULTADO = solver.twoSum(lista_de_numeros, numero_para_sumar);

        System.out.println("Index necesarios: [" + RESULTADO[0] + ", " + RESULTADO[1] + "]");

        //PILA

        EjemploPila pila = new EjemploPila();

        pila.push("Camarones con pollo");
        pila.push("Langosta con puré");
        pila.push("Rib-eye con puré y brócoli");
        pila.push("Spaghetti con albóndigas y salsa de tomate");
        pila.push("Plato con ensalada");

        pila.mostrarEstado();

        //COLA

        EjemploCola cola = new EjemploCola();
        cola.add("Cliente 1 de nombre: Tobias Thompson Junior. Profesión: Ingeniero electrico");
        cola.add("Cliente 2 de nombre: Simon Pedro Avitia Jaquez. Profesión: Ingeniero de software");
        cola.add("Cliente 3 de nombre: Mateo Valles Rivera. Profesión: Comerciante");
        cola.add("Cliente 4 de nombre: Juan el bautista. Profesión: Cerrajero");
        cola.add("Cliente 5 de nombre: María Magdalena. Profesión: Peleadora de KICKBOXING");
        cola.add("Cliente 6 de nombre: Bartolomeo. Profesión: Arquitecto");
        cola.add("Cliente 7 de nombre: Andres. Profesión: Pescador");
        cola.add("Cliente 8 de nombre: Santiago el menor. Profesión:Medico cirujano");
        cola.add("Cliente 9 de nombre: Jesús. Profesión: Carpintero");

        System.out.println("Cliente al frente: " + cola.peek());


        //lista enlzada

        LinkedList_SIMPLE list = new LinkedList_SIMPLE();
        list.insert(16); //un numero muy ESPECIAL
        list.insert(1978); //Cuando salió la primera película de Halloween
        list.insert(150); //Lo que me debe un amigo
        list.insert(30); //Lo que le debo yo
        list.insert(120); //un numero muy lindo
        list.insert(95); //El numero del rayo mcqueen

        System.out.println("List:");
        list.display();

        System.out.println("Acasooo... ¿Está 1978 en la lista? " + list.search(1978));

        list.delete(20);

        System.out.println("Wow que sorpresa, no pensaba que estuviera en la lista, bueno a seguirle:");
        list.display();


        
    }

}
