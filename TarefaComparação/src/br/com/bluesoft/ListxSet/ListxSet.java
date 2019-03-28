package br.com.bluesoft.ListxSet;

import br.com.bluesoft.padawan.Padawan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ListxSet {

    public void tempoExecucao (Set<Padawan> lista, String nome ){

        long tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            lista.add(new Padawan("Wesley Vitor", 4, 20 ));
        }
        System.out.println("Tempo de duração para adicionar um novo elemento ao fim da fila (" +nome + "): " + (System.currentTimeMillis() - tempoInicial));
    }

    public void tempoExecucao (List<Padawan> lista, String nome ){

        long tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            lista.add(new Padawan("Wesley Vitor", 4, 20 ));
        }
        System.out.println("Tempo de duração para adicionar um novo elemento ao fim da fila (" +nome + "): " + (System.currentTimeMillis() - tempoInicial));
    }

    public void tempoRemocao (List<Padawan> lista, String nome){
        long tempoInicial = System.currentTimeMillis();
        lista.remove(lista.get(10000));
        System.out.println("Tempo de execução para remover o item 10000 do (" + nome + "): " + (System.currentTimeMillis() - tempoInicial));
    }


    public static void main(String[] args){
        ListxSet classe = new ListxSet();

        List<Padawan> PadawanArrayList = new ArrayList<>();
        Set<Padawan> PadawanHashSet = new HashSet<>();
        Set<Padawan> PadawanLinkedHashSet = new LinkedHashSet<>();
        Set<Padawan> PadawanTreeSet = new TreeSet<>();
        DateTimeFormatter formatadorLocalDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        PadawanArrayList.add(new Padawan("Fatima Carneiro", 4, 23 ));
        PadawanArrayList.add(new Padawan("José Cestaro", 3, 20 ));
        PadawanArrayList.add(new Padawan("Camila Maejima", 2, 26 ));
        PadawanArrayList.add(new Padawan("Wesley Vitor", 1, 20 ));

        PadawanHashSet.add(new Padawan("Fatima Carneiro", 1, 23 ));
        PadawanHashSet.add(new Padawan("José Cestaro", 2, 20 ));
        PadawanHashSet.add(new Padawan("Camila Maejima", 3, 26 ));
        PadawanHashSet.add(new Padawan("Wesley Vitor", 3, 20 ));

        PadawanLinkedHashSet.add(new Padawan("Fatima Carneiro", 1, 23 ));
        PadawanLinkedHashSet.add(new Padawan("José Cestaro", 4, 20 ));
        PadawanLinkedHashSet.add(new Padawan("Camila Maejima", 3, 26 ));
        PadawanLinkedHashSet.add(new Padawan("Wesley Vitor", 4, 20 ));

        PadawanTreeSet.add(new Padawan("Fatima Carneiro", 3, 23 ));
        PadawanTreeSet.add(new Padawan("José Cestaro", 2, 20 ));
        PadawanTreeSet.add(new Padawan("Camila Maejima", 1, 26 ));
        PadawanTreeSet.add(new Padawan("Wesley Vitor", 4, 20 ));
        PadawanTreeSet.add(new Padawan("Wesley Vitor", 4, 20 ));


        System.out.println("Data da consulta: " + LocalDate.of(2022, 12, 5).format(formatadorLocalDate));
        System.out.println();

        System.out.println("ARRAYLIST");
        PadawanArrayList.forEach(System.out::println);
        System.out.println();
        System.out.println();

        System.out.println("HASHSET");
        PadawanHashSet.forEach(System.out::println);
        System.out.println();
        System.out.println();

        System.out.println("LINKEDHASHSET");
        PadawanLinkedHashSet.forEach(System.out::println);
        System.out.println();
        System.out.println();

        System.out.println("TREESET");
        PadawanTreeSet.forEach(System.out::println);
        System.out.println();
        System.out.println();

        classe.tempoExecucao(PadawanArrayList, "ArrayList");
        classe.tempoExecucao(PadawanHashSet, "HashSet");
        classe.tempoExecucao(PadawanLinkedHashSet, "LinkedHashSet");
        classe.tempoExecucao(PadawanTreeSet, "TreeSet");
    }
}
