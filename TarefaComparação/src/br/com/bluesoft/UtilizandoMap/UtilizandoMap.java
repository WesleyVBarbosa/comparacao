package br.com.bluesoft.UtilizandoMap;

import br.com.bluesoft.padawan.Padawan;

import java.util.HashMap;
import java.util.Map;

public class UtilizandoMap {

    public static void main(String[] args){

        Map<Integer,Padawan> consulta = new HashMap<>();

        consulta.put(1, new Padawan("Fatima Carneiro", 1, 23 ));
        consulta.put(4, new Padawan("Iriney Mato Grosso", 3, 23 ));
        consulta.put(3, new Padawan("Fatima Carneiro", 4, 23 ));

        Padawan aprendiz = consulta.get(4);
        System.out.println(aprendiz.getNome());

    }
}
