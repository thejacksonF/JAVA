package JAVA.java4;

class Nodo {
    int valor;
    Nodo izquierda, derecha;

    Nodo(int valor) {
        this.valor = valor;
        izquierda = derecha = null;
    }
}

public class ARBOLGEEKS {
    Nodo raiz;

    void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = insertarRecursivo(nodo.derecha, valor);
        }
        return nodo;
    }

    void recorrerEnOrden() {
        recorrerEnOrdenRecursivo(raiz);
    }

    void recorrerEnOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            recorrerEnOrdenRecursivo(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            recorrerEnOrdenRecursivo(nodo.derecha);
        }
    }

}
