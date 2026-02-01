package myBasic.c05_structures;

import java.util.HashMap;

/*
 * NOTAS DE ESTUDIO - MAPS (MAPAS/DICCIONARIOS) EN JAVA
 * 
 * ¿Qué es un Map?
 * - Estructura de datos que almacena pares CLAVE-VALOR
 * - Cada clave es ÚNICA (no se permiten claves duplicadas)
 * - Una clave puede tener solo un valor asociado
 * - También conocido como diccionario o tabla hash
 * - Parte del paquete java.util
 * 
 * Características principales:
 * - Claves únicas: si agregas una clave existente, reemplaza el valor
 * - Sin orden garantizado (HashMap)
 * - Acceso rápido por clave
 * - Tamaño dinámico
 * 
 * Implementaciones comunes:
 * - HashMap: más rápido, sin orden
 * - LinkedHashMap: mantiene orden de inserción
 * - TreeMap: mantiene claves ordenadas
 * 
 * Sintaxis:
 * - HashMap<TipoClave, TipoValor> nombre = new HashMap<>();
 * 
 * Métodos principales:
 * - put(clave, valor): agrega o actualiza un par clave-valor
 * - get(clave): obtiene el valor asociado a una clave (retorna null si no existe)
 * - containsKey(clave): verifica si existe una clave
 * - containsValue(valor): verifica si existe un valor
 * - remove(clave): elimina un par clave-valor y retorna el valor eliminado
 * - size(): retorna el número de pares clave-valor
 * - clear(): vacía el mapa
 * - keySet(): retorna un Set con todas las claves
 * - values(): retorna una Collection con todos los valores
 * 
 * Casos de uso:
 * - Almacenar datos relacionados (nombre-edad, ID-usuario, etc.)
 * - Búsquedas rápidas por clave
 * - Contar frecuencias
 * - Cachés y diccionarios
 */

public class Maps {
    static void main(String[] args) {

        // ========== DECLARACIÓN Y CREACIÓN DE MAPS ==========
        
        // HashMap con clave String y valor String
        // Ejemplo: nombre -> apellido
        HashMap<String, String> myMap = new HashMap<>();
        
        // Usando inferencia de tipo con var
        // Ejemplo: ID (Integer) -> nombre (String)
        var myMap2 = new HashMap<Integer, String>();

        // size() retorna el número de pares clave-valor (inicialmente 0)
        System.out.println(myMap.size());  // Imprime: 0

        // ========== AGREGAR ELEMENTOS ==========
        
        // put(clave, valor) agrega un par clave-valor al mapa
        // Si la clave ya existe, REEMPLAZA el valor anterior
        myMap.put("Gregory", "Vicent");   // Clave: "Gregory", Valor: "Vicent"
        myMap.put("Patricia", "Romano");
        myMap.put("Lauren", "Black");

        // Imprime todos los pares clave-valor
        System.out.println(myMap);  // Ejemplo: {Patricia=Romano, Gregory=Vicent, Lauren=Black}
        System.out.println(myMap.size());  // Imprime: 3

        // ========== ACCEDER A ELEMENTOS ==========
        
        // get(clave) retorna el valor asociado a la clave
        // Si la clave no existe, retorna null
        System.out.println(myMap.get("Gregory"));  // Imprime: Vicent
        System.out.println(myMap.get("pepe"));     // Imprime: null (clave no existe)

        // ========== VERIFICAR EXISTENCIA ==========
        
        // containsKey(clave) verifica si existe una clave en el mapa
        System.out.println(myMap.containsKey("Gregory"));  // Imprime: true
        
        // containsValue(valor) verifica si existe un valor en el mapa
        System.out.println(myMap.containsValue("Black"));  // Imprime: true
        
        System.out.println(myMap.containsKey("banana"));    // Imprime: false
        System.out.println(myMap.containsValue("pepino")); // Imprime: false

        // ========== ELIMINAR ELEMENTOS ==========
        
        // remove(clave) elimina el par clave-valor
        // Retorna el valor que estaba asociado a la clave (o null si no existía)
        System.out.println(myMap.remove("Gregory"));  // Imprime: Vicent (y lo elimina)

        // Ahora el mapa solo contiene 2 elementos
        System.out.println(myMap);  // Imprime: {Patricia=Romano, Lauren=Black}

        // ========== LIMPIAR EL MAPA ==========
        
        // clear() elimina todos los pares clave-valor del mapa
        myMap.clear();

        System.out.println(myMap.size());  // Imprime: 0
        
        // Otros métodos útiles:
        // keySet(): retorna un Set con todas las claves
        // values(): retorna una Collection con todos los valores
        // entrySet(): retorna un Set con todos los pares clave-valor


        // ========== LIMPIAR EL MAPA ==========

        myMap2.put(1, "Gregory");
        myMap2.put(2, "Ramon");
        myMap2.put(3, "Hector");

        System.out.println(myMap2.values());
        System.out.println(myMap2);
        System.out.println(myMap2.get(2));
    }
}
