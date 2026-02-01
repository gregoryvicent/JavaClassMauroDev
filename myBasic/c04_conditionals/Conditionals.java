package myBasic.c04_conditionals;

/*
 * NOTAS DE ESTUDIO - CONDICIONALES EN JAVA
 * 
 * Los condicionales permiten ejecutar código según se cumplan ciertas condiciones.
 * 
 * TIPOS DE CONDICIONALES:
 * 
 * 1. IF SIMPLE:
 *    - Ejecuta un bloque de código solo si la condición es true
 *    - Sintaxis: if (condición) { código }
 * 
 * 2. IF-ELSE:
 *    - Ejecuta un bloque si la condición es true, otro si es false
 *    - Sintaxis: if (condición) { código1 } else { código2 }
 * 
 * 3. IF-ELSE IF-ELSE:
 *    - Evalúa múltiples condiciones en secuencia
 *    - Se ejecuta SOLO el primer bloque cuya condición sea true
 *    - El else final es opcional (se ejecuta si ninguna condición es true)
 * 
 * 4. SWITCH:
 *    - Evalúa una expresión y ejecuta el caso que coincida
 *    - Útil cuando se compara una variable con múltiples valores específicos
 *    - break: sale del switch (sin break, continúa ejecutando los siguientes casos)
 *    - default: se ejecuta si ningún caso coincide (opcional)
 * 
 * IMPORTANTE:
 * - Las condiciones deben evaluar a boolean (true o false)
 * - Se pueden usar operadores de comparación (==, !=, <, >, <=, >=)
 * - Se pueden combinar condiciones con operadores lógicos (&&, ||, !)
 */

public class Conditionals {
    public static void main(String[] args) {

        // ========== DECLARACIÓN DE VARIABLES PARA EJEMPLOS ==========
        
        int x = 5;
        int y = 8;

        // ========== IF SIMPLE ==========
        // Solo ejecuta el bloque si la condición es verdadera
        // Si es falsa, no hace nada y continúa con el código siguiente
        
        if (x < y) {
            System.out.println("x es menor que y");  // Se ejecuta porque 5 < 8 es true
        }

        // ========== IF-ELSE ==========
        // Ejecuta un bloque u otro según la condición
        // Siempre se ejecuta uno de los dos bloques
        
        if (x > y) {
            System.out.println("x es mayor que y");  // No se ejecuta (5 > 8 es false)
        } else {
            System.out.println("x no es mayor que y");  // Se ejecuta
        }

        // ========== IF-ELSE IF-ELSE ==========
        // Evalúa múltiples condiciones en secuencia
        // Se ejecuta SOLO el primer bloque cuya condición sea verdadera
        // Las condiciones siguientes no se evalúan una vez que una es true
        
        if (x > y) {
            System.out.println("x es mayor que y");  // No se ejecuta (5 > 8 es false)
        } else if (x < y) {
            System.out.println("x es menor que y");  // Se ejecuta (5 < 8 es true)
            // Como esta condición es true, el else no se evalúa
        } else {
            System.out.println("x es igual a y");  // No se ejecuta
        }

        // ========== SWITCH ==========
        // Evalúa una expresión y ejecuta el caso (case) que coincida con su valor
        // Útil cuando se compara una variable con múltiples valores específicos
        // Más legible que múltiples if-else cuando hay muchas opciones

        int dayOfWeek = 5;
        
        switch (dayOfWeek) {
            case 1:  // Si dayOfWeek == 1
                System.out.println("Lunes");
                break;  // Sale del switch (sin break, continuaría al siguiente caso)
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");  // Se ejecuta porque dayOfWeek == 5
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:  // Se ejecuta si ningún caso coincide (como el else en if)
                System.out.println("Día no válido");
        }
        
        // Nota: En Java 12+ existe una sintaxis mejorada de switch con ->
        // que no requiere break y puede retornar valores
    }
}
