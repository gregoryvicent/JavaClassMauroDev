package myBasic.c02_operators;

/*
 * NOTAS DE ESTUDIO - OPERADORES EN JAVA
 * 
 * OPERADORES ARITMÉTICOS:
 * + (suma), - (resta), * (multiplicación), / (división), % (módulo/resto)
 * 
 * OPERADORES DE ASIGNACIÓN:
 * = (asignación simple)
 * +=, -=, *=, /=, %= (asignación compuesta: opera y asigna)
 * 
 * OPERADORES DE COMPARACIÓN (Relacionales):
 * == (igual a), != (diferente de)
 * > (mayor que), >= (mayor o igual que)
 * < (menor que), <= (menor o igual que)
 * Retornan: boolean (true o false)
 * 
 * OPERADORES LÓGICOS:
 * && (AND - Y lógico): true solo si ambos son true
 * || (OR - O lógico): true si al menos uno es true
 * ! (NOT - Negación): invierte el valor booleano
 * 
 * OPERADORES UNARIOS:
 * + (positivo), - (negativo)
 * ++ (incremento), -- (decremento)
 * Prefijo (++a): incrementa ANTES de usar el valor
 * Postfijo (a++): usa el valor y DESPUÉS incrementa
 */

public class Operators {
    public static void main(String[] args) {
        
        // ========== OPERADORES ARITMÉTICOS ==========

        int a = 5;
        int b = 2;

        // Suma
        System.out.println(a + b);  // Imprime: 7
        
        // Resta
        System.out.println(a - b);  // Imprime: 3
        
        // Multiplicación
        System.out.println(a * b);  // Imprime: 10
        System.out.println(a * b);  // Imprime: 10
        
        // División (entre enteros retorna entero, descarta decimales)
        System.out.println(a / b);  // Imprime: 2 (no 2.5)
        
        // Módulo (resto de la división)
        System.out.println(a % b);  // Imprime: 1 (5 ÷ 2 = 2 con resto 1)

        // ========== OPERADORES DE ASIGNACIÓN ==========

        // Asignación simple: a toma el valor de b
        a = b;  // a = 2
        a = a * 2;  // a = 4

        System.out.println(a);  // Imprime: 4

        // Asignación compuesta: suma y asigna (equivale a: a = a + 1)
        a += 1;  // a = 5

        System.out.println(a);  // Imprime: 5

        // Resta y asigna (equivale a: a = a - 1)
        a -= 1;  // a = 4

        System.out.println(a);  // Imprime: 4

        // Multiplica y asigna (equivale a: a = a * 2)
        a *= 2;  // a = 8

        System.out.println(a);  // Imprime: 8

        // Divide y asigna (equivale a: a = a / 2)
        a /= 2;  // a = 4

        System.out.println(a);  // Imprime: 4

        // Módulo y asigna (equivale a: a = a % 2)
        a %= 2;  // a = 0 (4 % 2 = 0)

        System.out.println(a);  // Imprime: 0

        // ========== OPERADORES DE COMPARACIÓN (Relacionales) ==========
        // Retornan valores booleanos (true o false)
        
        System.out.println(a == b);  // Imprime: false (0 no es igual a 2)
        System.out.println(a != b);  // Imprime: true (0 es diferente de 2)
        System.out.println(a > b);   // Imprime: false (0 no es mayor que 2)
        System.out.println(a >= b);  // Imprime: false (0 no es mayor o igual que 2)
        System.out.println(a < b);   // Imprime: true (0 es menor que 2)
        System.out.println(a <= b);  // Imprime: true (0 es menor o igual que 2)
        
        // ========== OPERADORES LÓGICOS ==========
        // Operan con valores booleanos
        
        // AND (&&): true solo si AMBOS son true
        System.out.println(true && true);   // Imprime: true
        System.out.println(true && false);  // Imprime: false
        
        // OR (||): true si AL MENOS UNO es true
        System.out.println(true || true);   // Imprime: true
        System.out.println(true || false);  // Imprime: true
        
        // NOT (!): invierte el valor booleano
        System.out.println(!true);  // Imprime: false
        
        // ========== OPERADORES UNARIOS ==========

        a = 4;

        // Positivo (no cambia el valor)
        System.out.println(+a);  // Imprime: 4
        
        // Negativo (invierte el signo)
        System.out.println(-a);  // Imprime: -4 (a sigue siendo 4)
        
        // Pre-incremento: incrementa ANTES de usar el valor
        System.out.println(++a);  // Imprime: 5 (a ahora es 5)
        
        // Post-incremento: usa el valor y DESPUÉS incrementa
        System.out.println(a++);  // Imprime: 5 (pero a ahora es 6)
        
        // Pre-decremento: decrementa ANTES de usar el valor
        System.out.println(--a);  // Imprime: 5 (a ahora es 5)
        
        // Post-decremento: usa el valor y DESPUÉS decrementa
        System.out.println(a--);  // Imprime: 5 (pero a ahora es 4)
    }
}
