package com.jgarcia.EntregasUT5;

import com.jgarcia.EntregasUT5.model.Manga;

import java.util.ArrayList;
import java.util.Optional;

public interface MangaService {
    //Método que retornará todos los mangas
    ArrayList<Manga> findAll();

    //Método que retornará un único manga pasándole como parámetro el id
    Optional<Manga> findById(Long id);

    //Guarda un manga pasado como parámetro
    void saveManga(Manga manga);

    /*Actualiza un manga con 2 parámetros:
        1. El id del manga a cambiar
        2. El manga modificado
       Hacemos que retorne el manga modificado
    */
    Manga updateManga(Long id, Manga manga);

    //Brorrar el manga por id
    void deleteMangaById(Long id);
}
