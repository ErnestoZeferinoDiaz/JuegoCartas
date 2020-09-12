package juegocartas;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Mazo a = new Mazo(1,true);
        System.out.println(a.getMazo().size() + " " + a);
        a.mezclar();
        System.out.println(a.getMazo().size() + " " + a);
        a.mezclar();
        System.out.println(a.getMazo().size() + " " + a);
        a.mezclar();
        System.out.println(a.getMazo().size() + " " + a);


    }
}
