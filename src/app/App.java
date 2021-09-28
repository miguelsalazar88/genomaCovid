package app;

import modelo.Modelo;

import java.util.LinkedList;

public class App {

    public static void main(String[] args) {

        Modelo m = new Modelo();
        String genoma = m.leerDoc();
        LinkedList<Character> letras = m.letrasEnDoc(genoma);
        System.out.println("Letras en el documento: " + letras.toString());

        for (Character c: letras) {
            m.letraRepetida(c,genoma);
        }



    }

}
