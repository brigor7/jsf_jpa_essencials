package com.aprender.listasCollections;

import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";
        String aula4 = "Conhecendo o JPA";
        String aula5 = "Implementando JSF";


        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);
        aulas.add(aula5);
        //aulas.remove(0);
        
        System.out.println(aulas);
        System.out.println(aulas.contains(aula1));
        System.out.println("tamanho: "+aulas.size());
        System.out.println("indexOf: "+aulas.indexOf(aula4));
        
        System.out.println("Imprimindo lista pelo for: ");
        for (String aula : aulas) {
        	System.out.println(aula);
		}
        
        System.out.println("******Antes da ordenação");
        aulas.forEach(aula->{
        	System.out.println(aula);
        });
        
        System.out.println("*****Após ordenação");
        Collections.sort(aulas);
        aulas.forEach(aula->{
        	System.out.println(aula);
        });
    }
}
