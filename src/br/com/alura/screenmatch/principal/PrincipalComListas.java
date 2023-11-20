package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class PrincipalComListas {
    public static void main (String[] atgs){
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(12);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(14);

        var filmeDoSamuel = new Filme("Dogville", 2003);
        filmeDoSamuel.avalia(16);

        Filme favorito = new Filme ("The Matrix",1999);
        favorito.avalia(18);

        Serie lost = new Serie("Lost",2000);
        lost.avalia(20);

        Filme f1 = filmeDoSamuel;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoSamuel);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        lista.add(favorito);

        for (Titulo item:lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam sandler");
        buscarPorArtista.add("Samuell Jackson");
        buscarPorArtista.add("jayson tool");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscarPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("Lista de Filmes por ano de lançamentos");
    }

}
