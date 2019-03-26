package br.com.bluesoft.ListxSet;

import br.com.bluesoft.padawan.Padawan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ListxSet {

    public static void main(String[] args){


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

        PadawanArrayList.forEach(System.out::println);
        System.out.println();
        System.out.println();

        PadawanHashSet.forEach(System.out::println);
        System.out.println();
        System.out.println();

        PadawanLinkedHashSet.forEach(System.out::println);
        System.out.println();
        System.out.println();

        PadawanTreeSet.forEach(System.out::println);
        System.out.println();
        System.out.println();
    }
}
