package myBasic.c03_strings;

/*
 * NOTAS DE ESTUDIO - STRINGS (CADENAS DE TEXTO) EN JAVA
 * 
 * ¿Qué es un String?
 * - Clase que representa secuencias de caracteres (texto)
 * - Es INMUTABLE: no se puede modificar, los métodos crean nuevos Strings
 * - Se puede crear con comillas dobles "" o con el constructor new String()
 * 
 * Métodos principales:
 * - length(): retorna la longitud del String
 * - charAt(index): retorna el carácter en la posición indicada
 * - substring(inicio, fin): extrae una porción del String
 * - toUpperCase() / toLowerCase(): convierte a mayúsculas/minúsculas
 * - contains(texto): verifica si contiene un texto
 * - equals(texto): compara contenido (usar en lugar de ==)
 * - equalsIgnoreCase(texto): compara ignorando mayúsculas/minúsculas
 * - trim(): elimina espacios al inicio y final
 * - replace(viejo, nuevo): reemplaza texto
 * - format(): crea Strings con formato (plantillas)
 * 
 * IMPORTANTE:
 * - Usar equals() para comparar contenido, NO el operador ==
 * - El operador == compara referencias (direcciones de memoria)
 */

public class StringsCourse {
    public static void main(String[] args) {

        // ========== DECLARACIÓN DE STRINGS ==========

        // Forma 1: Literal (más común)
        String firstname = "Gregory";

        System.out.println(firstname);  // Imprime: Gregory

        // Forma 2: Usando el constructor de la clase String
        var lastname = new String("Vicent");

        System.out.println(lastname);  // Imprime: Vicent

        // ========== CONCATENACIÓN ==========
        // Unir varios Strings usando el operador +

        System.out.println(firstname + " " + lastname);  // Imprime: Gregory Vicent

        // ========== LENGTH (Longitud) ==========
        // Retorna el número de caracteres del String

        String myText = "Hello";

        System.out.println(myText.length());  // Imprime: 5

        // ========== CHARAT (Carácter en posición) ==========
        // Retorna el carácter en el índice especificado (empieza en 0)

        System.out.println(myText.charAt(1));  // Imprime: e (H=0, e=1, l=2, l=3, o=4)

        // ========== SUBSTRING (Subcadena) ==========
        // Extrae una porción del String

        // Desde el índice 1 hasta el final
        System.out.println(myText.substring(1));  // Imprime: ello
        
        // Desde el índice 1 hasta el 4 (no incluye el 4)
        System.out.println(myText.substring(1, 4));  // Imprime: ell

        // ========== CONVERSIONES DE CASO ==========

        // Convierte todo el texto a mayúsculas
        System.out.println(myText.toUpperCase());  // Imprime: HELLO
        
        // Convierte todo el texto a minúsculas
        System.out.println(myText.toLowerCase());  // Imprime: hello

        // ========== CONTAINS (Contiene) ==========
        // Verifica si el String contiene una secuencia de caracteres
        // Retorna boolean (true o false)

        String myStringTest = "Esto es un texto de prueba";

        System.out.println(myStringTest.contains("es"));    // Imprime: true
        System.out.println(myStringTest.contains("papa"));  // Imprime: false

        // ========== EQUALS (Comparación de contenido) ==========
        // Compara el CONTENIDO de dos Strings
        // Retorna boolean (true o false)

        System.out.println(myText.equals("Hello"));  // Imprime: true
        System.out.println(myText.equals("Hola"));   // Imprime: false

        // equalsIgnoreCase: compara ignorando mayúsculas y minúsculas
        System.out.println(myText.equals("hello"));           // Imprime: false
        System.out.println(myText.equalsIgnoreCase("hello"));  // Imprime: true

        // ⚠️ IMPORTANTE: Diferencia entre == y equals()
        String a = "Gregory";
        String b = "Gregory";
        var c = new String("Gregory");

        System.out.println("Pruebas de comparación");

        // == compara referencias (direcciones de memoria)
        System.out.println(a == b);  // Imprime: true (mismo objeto en pool de Strings)
        System.out.println(a == c);  // Imprime: false (diferentes objetos en memoria)
        
        // equals() compara contenido (SIEMPRE usar para Strings)
        System.out.println(a.equals(b));  // Imprime: true (mismo contenido)
        System.out.println(a.equals(c));  // Imprime: true (mismo contenido)

        // ========== TRIM (Eliminar espacios) ==========
        // Elimina espacios en blanco al inicio y al final del String

        System.out.println("   Texto con espacio   ".trim());  // Imprime: Texto con espacio
        System.out.println("   Texto con espacio   ".trim());  // Imprime: Texto con espacio

        // ========== REPLACE (Reemplazar) ==========
        // Reemplaza todas las ocurrencias de un texto por otro
        // Retorna un NUEVO String (los Strings son inmutables)

        String testText = "Esto es un texto de pruebas";

        // Reemplaza "pruebas" por "tomate"
        System.out.println(testText.replace("pruebas", "tomate"));  // Imprime: Esto es un texto de tomate
        
        // Reemplaza espacios por barras
        System.out.println(testText.replace(" ", "/"));  // Imprime: Esto/es/un/texto/de/pruebas

        // ========== FORMAT (Formato) ==========
        // Crea Strings con formato usando marcadores de posición
        // %s = String, %d = entero (decimal), %f = decimal (float/double)

        int age = 26;
        String name = "Gregory";

        // Crea un String formateado insertando variables en los marcadores
        System.out.println(String.format("Mi nombre es %s, y tengo %d años", name, age));
        // Imprime: Mi nombre es Gregory, y tengo 26 años
    }
}
