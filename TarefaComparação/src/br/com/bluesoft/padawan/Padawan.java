package br.com.bluesoft.padawan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Padawan implements Comparable<Padawan>{

    private String nome;
    private int codigo;
    private int idade;

    public Padawan(String nome, int codigo, int idade){
        this.nome = nome;
        this.codigo = codigo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {

        DateTimeFormatter formatadorLocalDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        return "Foi impresso ("+ LocalDateTime.now().format(formatadorLocalDateTime)+") - ["+getCodigo()+"] = Nome: " + getNome() + ", " + "Idade: " + getIdade();
    }

    @Override
    public int compareTo(Padawan aprendizJedi) {


        return this.getCodigo() - aprendizJedi.getCodigo();
    }
}
