package myBasic.c05_structures;

import java.util.ArrayList;

public class Lists {
    static void main(String[] args) {

        // Array List
        // Definición
        ArrayList<String> names = new ArrayList<>();
        var ages = new ArrayList<Integer>();

        System.out.println(names.size());
        System.out.println(ages.size());

        // Añadir elementos
        names.add("Gregory");
        names.add("Anna");
        names.add("Marta");

        // Acceder a elementos
        System.out.println(names.size());
        System.out.println(names.get(1));
        System.out.println(names.get(0));
//        System.out.println(names.getFirst());
        System.out.println(names.get(1));
//        System.out.println(names.getLast());

        // Modificar elementos

        names.set(0, "Gregory modificado");
        System.out.println(names.get(0));
        names.set(2, "Marta modificado");
        System.out.println(names.get(2));

        // Eliminar elementos

        names.remove(1);
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.size());
//        System.out.println(names.get(2));

        // Buscar elementos

        System.out.println(names.contains("Gregory modificado"));

        // Limpiar ArrayList

        names.clear();
        System.out.println(names.size());
    }
}
