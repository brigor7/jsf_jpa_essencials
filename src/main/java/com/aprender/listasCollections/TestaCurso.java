package com.aprender.listasCollections;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");
        Aula a1 = new Aula("Treinando primefaces",45);
        Aula a2 = new Aula("Agile na pratica",35);
        javaColecoes.getAulas().add(a1);
        javaColecoes.getAulas().add(a2);
        
        List<Aula> aulas = javaColecoes.getAulas();        
        System.out.println(aulas);
        
        System.out.println(javaColecoes);
    }
}