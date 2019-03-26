package br.com.bluesoft.linkedlistxarraylist;

import br.com.bluesoft.padawan.Padawan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class LinkedListxArrayList {
    public static void main(String[] args) {

        List<Padawan> PadawanArrayList = new ArrayList<>();
        List<Padawan> PadawanLinkedList = new LinkedList<>();


        PadawanArrayList.add(new Padawan("Fatima Carneiro", 1, 23 ));
        PadawanArrayList.add(new Padawan("José Cestaro", 2, 20 ));
        PadawanArrayList.add(new Padawan("Camila Maejima", 3, 26 ));
        PadawanArrayList.add(new Padawan("Wesley Vitor", 4, 20 ));

        PadawanArrayList.forEach(new Consumer<Padawan>() {
            @Override
            public void accept(Padawan padawan) {
                System.out.println(padawan);
            }
        });

        System.out.println();
        Optional listaFiltrada = PadawanArrayList.stream().filter(s -> s.getIdade() >= 21).findAny();
        System.out.println();
        System.out.println(listaFiltrada);


        PadawanLinkedList.add(new Padawan("Fatima Carneiro", 1, 23 ));
        PadawanLinkedList.add(new Padawan("José Cestaro", 2, 20 ));
        PadawanLinkedList.add(new Padawan("Camila Maejima", 3, 26 ));
        PadawanLinkedList.add(new Padawan("Wesley Vitor", 4, 20 ));
        PadawanLinkedList.forEach(System.out::println);
        System.lineSeparator();
        System.out.println();

       long tempoAdd = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            PadawanArrayList.add(new Padawan("Wesley Vitor", 4, 20 ));
        }
        System.out.println("Tempo de duração para adicionar um novo elemento ao fim da fila (ARRAYLIST): " + (System.currentTimeMillis() - tempoAdd));

        long tempoAddLinkedlist = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            PadawanLinkedList.add(new Padawan("Wesley Vitor", 4, 20 ));
        }
        System.out.println("Tempo de duração para adicionar um novo elemento ao fim da fila (LINKEDLIST): " + (System.currentTimeMillis() - tempoAddLinkedlist));

        long tempoInicialRemoveAL = System.currentTimeMillis();
        PadawanArrayList.remove(PadawanArrayList.get(5000));
        System.out.println("Tempo de execução para remover o item 5000 do (ARRAYLIST): " + (System.currentTimeMillis() - tempoInicialRemoveAL));

        long tempoInicialRemoveLL = System.currentTimeMillis();
        PadawanLinkedList.remove(PadawanArrayList.get(5000));
        System.out.println("Tempo de execução para remover o item 5000 do (LINKEDLIST): " + (System.currentTimeMillis() - tempoInicialRemoveLL));














    }
}
