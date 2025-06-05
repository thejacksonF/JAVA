package JAVA.java4;

import java.util.HashMap;

public class TwoMultiplication {
    public int[] twoMultiply(int[] lista_de_numeros_para_multiplicacion, int producto_objetivo) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < lista_de_numeros_para_multiplicacion.length; i++) {
            int actual = lista_de_numeros_para_multiplicacion[i];

            if (actual != 0 && producto_objetivo % actual == 0) {
                int complemento = producto_objetivo / actual;
                if (map.containsKey(complemento)) {
                    return new int[] { map.get(complemento), i };
                }
            }

            map.put(actual, i);
        }

        return new int[] {};
    }
}
