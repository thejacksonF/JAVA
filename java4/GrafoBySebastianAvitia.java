package JAVA.java4;
import java.util.*;


public class GrafoBySebastianAvitia {
    Map<Integer, List<Integer>> conexiones = new HashMap<>();

    public void agregarArista(int origen, int destino) {
        conexiones.computeIfAbsent(origen, k -> new ArrayList<>()).add(destino);
        conexiones.computeIfAbsent(destino, k -> new ArrayList<>()).add(origen);
    }
    
    public void mostrar() {
        for (var entrada : conexiones.entrySet()) {
            System.out.println("Numero de nodo " + entrada.getKey() + " conectado a " + entrada.getValue());
        
            }   
    
        }

    }

