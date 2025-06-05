package JAVA.java4;

public class ListaDoble {
    private Nodo inicio, fin;

    public void agregarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            nuevo.sig = inicio;
            inicio.ant = nuevo;
            inicio = nuevo;
        }
    }

    public void agregarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (fin == null) {
            inicio = fin = nuevo;
        } else {
            fin.sig = nuevo;
            nuevo.ant = fin;
            fin = nuevo;
        }
    }

    public void eliminar(int dato) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.dato == dato) {
                if (actual.ant != null) actual.ant.sig = actual.sig;
                else inicio = actual.sig;

                if (actual.sig != null) actual.sig.ant = actual.ant;
                else fin = actual.ant;

                System.out.println("Se ha eleminado el siguiente elemento: " + dato);
                return;
            }
            actual = actual.sig;
        }
        System.out.println("No se ha encontrado: " + dato);
    }

    public void mostrar() {
        Nodo actual = inicio;
        System.out.print("Lista: ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.sig;
        }
        System.out.println();
    }
}



class Nodo {
    int dato;
    Nodo ant, sig;

    Nodo(int dato) {
        this.dato = dato;
    }
}

