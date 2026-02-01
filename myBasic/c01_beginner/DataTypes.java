package myBasic.c01_beginner;

/*
 * NOTAS DE ESTUDIO - TIPOS DE DATOS PRIMITIVOS EN JAVA
 * 
 * Java tiene 8 tipos de datos primitivos:
 * 
 * ENTEROS:
 * - byte:  8 bits  | Rango: -128 a 127
 * - short: 16 bits | Rango: -32,768 a 32,767
 * - int:   32 bits | Rango: -2,147,483,648 a 2,147,483,647 (más común)
 * - long:  64 bits | Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
 * 
 * DECIMALES:
 * - float:  32 bits | Precisión: ~6-7 dígitos decimales (requiere 'f' al final)
 * - double: 64 bits | Precisión: ~15 dígitos decimales (más común para decimales)
 * 
 * OTROS:
 * - char:    16 bits | Almacena un solo carácter Unicode (usa comillas simples '')
 * - boolean: 1 bit   | Solo dos valores: true o false
 * 
 * Nota: Estos son tipos primitivos (no son objetos), por lo que:
 * - Son más eficientes en memoria
 * - No tienen métodos
 * - Se almacenan directamente en la pila (stack)
 */

public class DataTypes {
    public static void main(String[] args) {
        
        // ========== TIPOS DE DATOS PRIMITIVOS ==========
        
        // INT: Tipo entero más común (32 bits)
        // Usado para números enteros sin decimales
        int myInt = 26;
        System.out.println(myInt);  // Imprime: 26
        
        // DOUBLE: Tipo decimal más común (64 bits)
        // Mayor precisión que float, ideal para cálculos científicos
        double myDouble = 1.75;
        System.out.println(myDouble);  // Imprime: 1.75
        
        // FLOAT: Tipo decimal de menor precisión (32 bits)
        // Requiere 'f' o 'F' al final del número
        // Usa menos memoria que double
        float myFloat = 1.5f;
        System.out.println(myFloat);  // Imprime: 1.5
        
        // LONG: Entero de mayor capacidad (64 bits)
        // Para números enteros muy grandes
        // Opcionalmente se puede usar 'L' al final: 123L
        long myLong = 123;
        System.out.println(myLong);  // Imprime: 123
        
        // BYTE: Entero pequeño (8 bits)
        // Rango: -128 a 127
        // Útil para ahorrar memoria en arrays grandes
        byte myByte = 123;
        System.out.println(myByte);  // Imprime: 123
        
        // CHAR: Almacena un solo carácter (16 bits)
        // Usa comillas simples ''
        // Puede almacenar letras, números, símbolos o caracteres Unicode
        char myChar = 'a';
        System.out.println(myChar);  // Imprime: a
        
        // BOOLEAN: Tipo lógico (1 bit)
        // Solo dos valores posibles: true o false
        // Usado en condiciones y control de flujo
        boolean myBoolean = true;
        System.out.println(myBoolean);  // Imprime: true
    }
}
