package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {
    
    public Mapa() {
        HashMap();
        LinkedHashMapa();
        treeMapa();
    }
    
    public void HashMap(){
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("manzana", 10);
        mapa.put("pera", 20);
        mapa.put("durazno", 30);
        mapa.put("mango", 40);

        // Verificar si una clave existe
        System.out.println("Hay pera: " + mapa.containsKey("pera"));
        System.out.println("Hay kiwi: " + mapa.containsKey("kiwi"));

        // Obtener valor asociado a una clave
        System.out.println("Valor de pera: " + mapa.get("pera"));

        // Eliminar un elemento del mapa
        mapa.remove("pera");
        System.out.println("Mapa después de eliminar pera: " + mapa);
    }
    
    public void LinkedHashMapa(){
        // Crear un LinkedHashMap para mantener el orden de inserción
        LinkedHashMap<String, Integer> likMap = new LinkedHashMap<>();
        likMap.put("Juan", 25);
        likMap.put("Ana", 30);
        likMap.put("Pedro", 28);
        
        System.out.println("Contenido de LinkedHashMap:");
        System.out.println(likMap);
    }
    
    public void treeMapa(){
        // Crear un TreeMap para almacenar claves en orden natural
        TreeMap<String, Integer> mapaTree = new TreeMap<>();
        mapaTree.put("Juan", 25);
        mapaTree.put("Ana", 30);
        mapaTree.put("Pedro", 28);
        
        System.out.println("Contenido de TreeMap:");
        System.out.println(mapaTree);
    }
}

