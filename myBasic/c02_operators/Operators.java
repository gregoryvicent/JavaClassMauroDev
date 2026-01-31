package myBasic.c02_operators;

public class Operators {
    public static void main(String[] args) {
        // Operadores

        // Valores Aritméticos

        int a = 5;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Asignación

        a = b;
        a = a * 2;

        System.out.println(a);

        a += 1;

        System.out.println(a);

        a -= 1;

        System.out.println(a);

        a *= 2;

        System.out.println(a);

        a /= 2;

        System.out.println(a);

        a %= 2;

        System.out.println(a);

        // Operadores de comparación (Relacionales)
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        // Operadores Lógicos
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(!true);
        // Operadores Unarios

        a = 4;

        System.out.println(+a);
        System.out.println(-a);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a--);
    }
}
