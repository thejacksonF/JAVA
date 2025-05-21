package JAVA.java4;
import java.util.HashMap;

public class SumaDosNumeros {
    public int[] twoSum(int[] lista_de_numeros, int numero_para_sumar) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < lista_de_numeros.length; i++) {
            int numero_need = numero_para_sumar - lista_de_numeros[i];

            if (map.containsKey(numero_need)) {
                return new int[] { map.get(numero_need), i };
            }

            map.put(lista_de_numeros[i], i);
        }

        // En caso de no encontrar solución, aunque el enunciado dice que siempre habrá una
        return new int[] {};
    }
}
