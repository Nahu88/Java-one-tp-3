package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9 );
        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.evalua(8);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.evalua(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);

        for (Titulo item:lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula){
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");

        Collections.sort(listaDeArtistas);
        System.out.println("lista de artistas  ordenada: "  + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("lista de artistas  ordenada: "  + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("lista ordenada por fecha"lista);
    }
}
