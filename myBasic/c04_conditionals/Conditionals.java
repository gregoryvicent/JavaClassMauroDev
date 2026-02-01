package myBasic.c04_conditionals;

public class Conditionals {
    public static void main(String[] args) {

        // Declaración de variables para ejemplos
        int x = 5;
        int y = 8;

        // IF SIMPLE: Solo ejecuta el bloque si la condición es verdadera
        if (x < y) {
            System.out.println("x es menor que y");
        }

        // IF-ELSE: Ejecuta un bloque u otro según la condición
        if (x > y) {
            System.out.println("x es mayor que y");
        } else {
            System.out.println("x no es mayor que y");
        }

        // IF-ELSE IF-ELSE: Evalúa múltiples condiciones en secuencia
        // Se ejecuta solo el primer bloque cuya condición sea verdadera
        if (x > y) {
            System.out.println("x es mayor que y");
        } else if (x < y) {
            System.out.println("x es menor que y");
        } else {
            System.out.println("x es igual a y");
        }

        // Sentencia Switch: Evalúa una expresión y ejecuta un bloque según el valor de la misma

        int dayOfWeek = 5;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no válido");
        }
    }
}
