import java.util.LinkedList;
import java.util.Queue;

public class EjemploDeCola {
    Queue<Integer> cola = new LinkedList<>();

    public void añadir_a_la_cola(int valor) {
        cola.add(valor);
    }

    public int eliminar_de_la_cola() {
        return cola.poll();
    }

    public boolean VACIAR_LA_LISTA() {
        return cola.isEmpty();
    }

}




