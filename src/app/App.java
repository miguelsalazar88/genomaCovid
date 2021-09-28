package app;

import modelo.Combinacion;
import modelo.Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static Scanner leerdato= new Scanner(System.in);
    public static void main(String[] args) {

        Modelo m = new Modelo();
        String genoma = m.leerDoc();
        LinkedList<Character> letras = m.letrasEnDoc(genoma);
        System.out.println("Letras en el documento: " + letras.toString());

        for (Character c: letras) {
            m.letraRepetida(c,genoma);
        }

        ArrayList<String> combinaciones = m.combinaciones(letras);
        System.out.println(combinaciones.toString());

        System.out.println("digite la cantidad de posiciones que decea analizar");
        int posiciones = leerdato.nextInt();
        for(int i=0;i<posiciones;i++)
        {
            HashMap<String,Combinacion> combinatorias = m.combinatorias(genoma,posiciones,i);
            System.out.println("todas las posibles combinaciones de orden "+posiciones+" posiciones son:");
            System.out.println(combinatorias);
        }

    }

}
