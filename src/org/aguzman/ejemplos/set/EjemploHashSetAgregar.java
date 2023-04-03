package org.aguzman.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        //Set no es ordenado, no garantiza ningún orden, no permite elementos duplicados
        Set<String> hs = new HashSet<>();
        out.println(hs.add("uno"));
        out.println(hs.add("dos"));
        out.println(hs.add("tres"));
        out.println(hs.add("cuatro"));
        out.println(hs.add("cinco"));

        out.println(hs);

        boolean b = hs.add("tres");
        out.println("Permite elementos duplicados = " + b);
        out.println(hs);

    }
}
