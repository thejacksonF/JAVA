package JAVA.java4;
import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        // PUSH: Agregando elementos
        pila.push(" Camarones con pollo");

        pila.push("Langosta con pure");

        pila.push("Rib-eye con pure y brocoli");

        pila.push("spaguetti con albondigas y salsa de tomate");

        pila.push("Plato con ensalada");


        System.out.println("Elemento de haasta arriba: " + pila.peek());

        System.out.println("Se removio el elemento: " + pila.pop());
        System.out.println("Se removio el elemento: " + pila.pop());

        System.out.println("Nuevo elemento: " + pila.peek());
        
    }
}