package modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.Stream;

public class Modelo {

    public Modelo(){

    }

    public String leerDoc(){

        Path path = Paths.get("/Users/miguelsalazar/git/genomaCovid/src/docs/sequences.fasta");
        StringBuilder sb = new StringBuilder();

        try{
            Stream<String> stream = Files.lines(path);
            stream.forEach(s -> sb.append(s));
        } catch (IOException e){
            System.out.println("Pailander");
        }
        return sb.toString();
    }

    public LinkedList<Character> letrasEnDoc(String s){
        LinkedList<Character> letras = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if(!letras.contains(s.charAt(i))){
                letras.add(s.charAt(i));
            }
        }
        return letras;
    }

    public long letraRepetida(char letra, String s){
        long num = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==letra){
                num++;
            }
        }
        System.out.println("La letra " + letra + " se repite " +  num + " veces en el documento." );
        return num;
    }

    public ArrayList<String> combinaciones(LinkedList<Character> letras){

        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < letras.size(); i++) {
            for (int j = 0; j < letras.size(); j++) {
                for (int k = 0; k < letras.size(); k++) {
                    for (int l = 0; l < letras.size(); l++) {
                        String s = String.valueOf(letras.get(i))
                                + String.valueOf(letras.get(j))
                                + String.valueOf(letras.get(k))
                                + String.valueOf(letras.get(l));
                        lista.add(s);
                    }
                }

            }
        }
        return lista;
    }

}
