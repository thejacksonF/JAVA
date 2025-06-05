package JAVA.java4;
import java.util.Stack;

public class EjemploPila {
    private Stack<String> pila;

    public EjemploPila() {
        pila = new Stack<>();
    }

    public void push(String elemento) {
        pila.push(elemento);
    }

    public String peek() {
        return pila.isEmpty() ? "" : pila.peek();
    }

    public String pop() {
        return pila.isEmpty() ? "No se puede borrar nada porque pues, no hay nada :D" : pila.pop();
    }


    public void mostrarEstado() {
        System.out.println("Elemento hasta arriba: " + peek());

        System.out.println("Se removió el elemento: " + pop());
        System.out.println("Se removió el elemento: " + pop());

        System.out.println("Nuevo elemento hasta arriba: " + peek());

    }
}