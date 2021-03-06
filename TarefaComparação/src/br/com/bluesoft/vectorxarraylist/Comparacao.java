package br.com.bluesoft.vectorxarraylist;

import br.com.bluesoft.ListxSet.ListxSet;
import br.com.bluesoft.padawan.Padawan;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Comparacao {

    public static void main(String[] args) {
        ListxSet classe = new ListxSet();

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


        System.out.println();
        classe.tempoExecucao(timePadawanVector, "Vector");
        classe.tempoExecucao(timePadawanArrayList, "ArrayList");
    }
}
