package controllers;

import java.util.HashMap;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad, sin importar el orden.
     *
     * @param str1 Primera cadena
     * @param str2 Segunda cadena
     * @return true si son anagramas, false en caso contrario
     */
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> frecuencia = new HashMap<>();

        for (char c : str1.toCharArray()) {
            frecuencia.put(c, frecuencia.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!frecuencia.containsKey(c) || frecuencia.get(c) == 0) {
                return false;
            }
            frecuencia.put(c, frecuencia.get(c) - 1);
        }

        return true;
    }

    /**
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números cuya suma sea igual al objetivo.
     * Se asume que hay una sola solución.
     *
     * @param nums     Array de números enteros
     * @param objetivo Número objetivo
     * @return Array con los dos índices o null si no se encuentra una solución
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        HashMap<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = objetivo - nums[i];

            if (mapa.containsKey(complemento)) {
                return new int[]{mapa.get(complemento), i};
            }

            mapa.put(nums[i], i);
        }

        return null; // Si no se encuentra una solución
    }
}
