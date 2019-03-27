package br.com.bluesoft.vectorxarraylist;

import br.com.bluesoft.padawan.Padawan;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Comparacao {

    public static void main(String[] args) {

        List<Padawan> timePadawanVector = new Vector<>();

        List<Padawan> timePadawanArrayList = new ArrayList<>();

        Padawan p1 = new Padawan("Fatima Carneiro", 1, 23 );
        Padawan p2 = new Padawan("José Cestaro", 2, 20 );


        timePadawanVector.add(new Padawan("Fatima Carneiro", 1, 23 ));
        timePadawanVector.add(new Padawan("José Cestaro", 2, 20 ));
        timePadawanVector.add(new Padawan("Camila Maejima", 3, 26 ));
        timePadawanVector.add(new Padawan("Wesley Vitor", 4, 20 ));

        timePadawanArrayList.add(p1);
        timePadawanArrayList.add(p2);
        timePadawanArrayList.add(new Padawan("Camila Maejima", 3, 26 ));
        timePadawanArrayList.add(new Padawan("Wesley Vitor", 4, 20 ));

        timePadawanArrayList.sort((o1, o2) -> 0);

        timePadawanArrayList.forEach(padawan -> System.out.println(padawan));
        System.out.println();
        timePadawanVector.forEach(System.out::println);


        long tempoInicialVector = System.currentTimeMillis();
        for (int i = 0; i < 10000000 ; i++) {
            timePadawanVector.add(new Padawan("Pi", 22,26));
        }
        System.out.println("Tempo para inserir 10000000 de elementos dentro de um Vector: " +(System.currentTimeMillis() - tempoInicialVector));
        System.out.println();

        long tempoInicialArrayList = System.currentTimeMillis();
        for (int i = 0; i < 10000000 ; i++) {
            timePadawanArrayList.add(new Padawan("Cestaro", 33, 24));
        }
        System.out.println("Tempo para inserir 10000000 de elementos dentro de um ArrayList: " +(System.currentTimeMillis() - tempoInicialArrayList));








    }
}
