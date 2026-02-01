package myBasic.c05_structures;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * NOTAS DE ESTUDIO - EJERCICIOS DE ESTRUCTURAS DE DATOS
 * 
 * Este archivo contiene ejercicios prácticos sobre:
 * - Arrays: estructuras de tamaño fijo
 * - ArrayList: listas dinámicas
 * - HashSet: conjuntos sin duplicados
 * - HashMap: mapas clave-valor
 * - Conversiones entre estructuras de datos
 * 
 * CONCEPTOS CLAVE DE CONVERSIONES:
 * 
 * Array -> ArrayList:
 * - Para objetos: new ArrayList<>(List.of(array))
 * - Para primitivos: Arrays.stream(array).boxed().collect(Collectors.toList())
 * 
 * ArrayList -> HashSet:
 * - new HashSet<>(arrayList)
 * - Elimina automáticamente los duplicados
 * 
 * HashSet -> HashMap:
 * - Usar streams: set.stream().collect(Collectors.toMap(key -> key, value -> value))
 * - Cada elemento del Set se convierte en clave y valor del Map
 * 
 * IMPORTANTE:
 * - Arrays de primitivos (int, double, etc.) requieren conversión especial
 * - Arrays de objetos (String, Integer, etc.) se convierten más fácilmente
 * - Streams son una forma moderna de procesar colecciones (Java 8+)
 */

public class Exercises {
    static void main(String[] args) {

        // ========== EJERCICIO 1: Array y su longitud ==========
        // Crea un Array con 5 valores e imprime su longitud.

        // Array de enteros con 5 posiciones (valores por defecto: 0)
        int[] myArray = new int[5];

        // length es una propiedad (no método) que retorna el tamaño del array
        System.out.println(myArray.length);  // Imprime: 5

        // ========== EJERCICIO 2: Modificar valores del Array ==========
        // Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.

        // Valor antes de modificar (valor por defecto: 0)
        System.out.println(myArray[1]);  // Imprime: 0

        // Modificar el valor en el índice 1
        myArray[1] = 100;

        // Valor después de modificar
        System.out.println(myArray[1]);  // Imprime: 100

        // ========== EJERCICIO 3: Crear ArrayList vacío ==========
        // Crea un ArrayList vacío.

        ArrayList<String> myArrayList = new ArrayList<>();

        // ========== EJERCICIO 4: Añadir y eliminar en ArrayList ==========
        // Añade 4 valores al ArrayList y elimina uno a continuación.

        // add() agrega elementos al final de la lista
        myArrayList.add("Venezuela");
        myArrayList.add("Argentina");
        myArrayList.add("Italia");
        myArrayList.add("Japón");

        System.out.println(myArrayList);  // Imprime: [Venezuela, Argentina, Italia, Japón]

        // remove(index) elimina el elemento en la posición indicada
        myArrayList.remove(1);  // Elimina "Argentina"

        System.out.println(myArrayList);  // Imprime: [Venezuela, Italia, Japón]

        // ========== EJERCICIO 5: Crear HashSet con valores ==========
        // Crea un HashSet con 2 valores diferentes.

        HashSet<String> myHashSet = new HashSet<>();

        System.out.println(myHashSet);  // Imprime: []

        // add() agrega elementos al conjunto
        myHashSet.add("Azul");
        myHashSet.add("Rojo");

        System.out.println(myHashSet);  // Imprime: [Azul, Rojo] (orden puede variar)

        // ========== EJERCICIO 6: Valores repetidos en HashSet ==========
        // Añade un nuevo valor repetido y otro sin repetir al HashSet.

        // Intentar agregar "Rojo" nuevamente (ya existe, se ignora)
        myHashSet.add("Rojo");   // No se agrega (duplicado)
        myHashSet.add("Verde");  // Sí se agrega (nuevo)

        // Solo se agregó "Verde", "Rojo" duplicado fue ignorado
        System.out.println(myHashSet);  // Imprime: [Azul, Rojo, Verde] (orden puede variar)

        // ========== EJERCICIO 7: Eliminar elemento del HashSet ==========
        // Elimina uno de los elementos del HashSet.

        myHashSet.remove("Verde");

        System.out.println(myHashSet);  // Imprime: [Azul, Rojo] (orden puede variar)

        // ========== EJERCICIO 8: HashMap de contactos ==========
        // Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.

        // HashMap<Clave, Valor> - En este caso: <Nombre, Teléfono>
        HashMap<String, String> contacts = new HashMap<>();

        System.out.println(contacts);  // Imprime: {}

        // put(clave, valor) agrega pares clave-valor
        contacts.put("Gregory", "04242002350");
        contacts.put("Ramon", "04124432840");
        contacts.put("Luisa", "04143322245");

        System.out.println(contacts);  // Imprime: {Gregory=04242002350, Ramon=04124432840, Luisa=04143322245}

        // ========== EJERCICIO 9: Modificar y eliminar en HashMap ==========
        // Modifica uno de los contactos y elimina otro.

        // replace(clave, nuevoValor) modifica el valor de una clave existente
        contacts.replace("Ramon", "94573749920");
        
        // remove(clave) elimina el par clave-valor
        contacts.remove("Luisa");

        System.out.println(contacts);  // Imprime: {Gregory=04242002350, Ramon=94573749920}

        // ========== EJERCICIO 10: Conversiones entre estructuras ==========
        // Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet 
        // y finalmente en un HashMap con clave y valor iguales.

        // Arrays de ejemplo: uno de primitivos (int) y otro de objetos (String)
        int[] dataArray = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        String[] dataStringArray = {"Hola", "Hola", "Mundo", "Mundo", "Mundo", "!", "!", "!", "!"};

        System.out.println(dataArray[0]);     // Imprime: 1
        System.out.println(dataArray.length); // Imprime: 15

        // --- CONVERSIÓN 1: Array de Strings -> ArrayList ---
        
        // List.of() crea una lista inmutable del array
        // new ArrayList<>() crea una lista mutable a partir de esa lista
        ArrayList<String> dataArrayList2 = new ArrayList<>(List.of(dataStringArray));

        System.out.println(dataArrayList2);      // Imprime: [Hola, Hola, Mundo, Mundo, Mundo, !, !, !, !]
        System.out.println(dataArrayList2.get(0)); // Imprime: Hola

        // --- CONVERSIÓN 2: Array de primitivos (int) -> ArrayList ---
        // Los arrays de primitivos requieren un proceso más complejo

        // Paso 1: Convertir array de int a IntStream (flujo de enteros)
        IntStream dataStream = Arrays.stream(dataArray);
        System.out.println(dataStream);  // Imprime: java.util.stream.IntStreamPipeline@...

        // Paso 2: Convertir IntStream a Stream<Integer> (boxed convierte int a Integer)
        // Necesario porque las colecciones solo trabajan con objetos, no primitivos
        Stream<Integer> dataStreamObject = dataStream.boxed();
        System.out.println(dataStreamObject);  // Imprime: java.util.stream.ReferencePipeline@...

        // Paso 3: Convertir Stream a List
        List<Integer> dataList = dataStreamObject.toList();
        System.out.println(dataList);  // Imprime: [1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5]

        // Paso 4: Convertir List a ArrayList (toList() retorna lista inmutable)
        ArrayList<Integer> dataArrayList = new ArrayList<>(dataList);
        System.out.println(dataArrayList);  // Imprime: [1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5]


        // --- CONVERSIÓN 3: ArrayList -> HashSet ---
        // El constructor de HashSet acepta cualquier colección
        // Automáticamente elimina los duplicados

        HashSet<Integer> dataHashSet = new HashSet<>(dataArrayList);
        HashSet<String> dataHashSet2 = new HashSet<>(dataArrayList2);
        
        System.out.println(dataHashSet);   // Imprime: [1, 2, 3, 4, 5] (duplicados eliminados)
        System.out.println(dataHashSet2);  // Imprime: [Hola, Mundo, !] (duplicados eliminados)

        // --- CONVERSIÓN 4: HashSet -> HashMap ---
        // Convertir cada elemento del Set en un par clave-valor donde clave == valor

        // Paso 1: Convertir HashSet a Stream
        Stream<String> setStream = dataHashSet2.stream();

        // Paso 2: Usar Collectors.toMap() para crear el HashMap
        // Primer parámetro (text -> text): función para obtener la clave
        // Segundo parámetro (text -> text): función para obtener el valor
        // En este caso, el mismo elemento se usa como clave y valor
        Map<String, String> myMap = setStream.collect(Collectors.toMap(text -> text, text -> text));
        
        System.out.println(myMap);  // Imprime: {Hola=Hola, Mundo=Mundo, !=!}
    }
}
