package com.jgarcia.EntregasUT5.controller;

import com.jgarcia.EntregasUT5.MangaServiceImpl;
import com.jgarcia.EntregasUT5.model.Manga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController {
    @Autowired
    private MangaServiceImpl mangaServiceImpl;

    //IMPLEMENTAMOS OPERACIONES C.R.U.D

    //Operacion para guardar nuevos mangas (C - POST)
    @PostMapping("/alta")
    public void saveManga(Manga manga) {
        mangaServiceImpl.saveManga(manga);
    }

    //Operación para obtener todos los mangas (R - GET)
    @GetMapping("/mangas")
    public List<Manga> listAll() {
        return mangaServiceImpl.findAll();
    }

    //Operación para actualizar un manga (U - PUT)
    @PutMapping("/mangas/{id}")
    public Manga updateManga(@PathVariable Long id, Manga manga) {
        return mangaServiceImpl.updateManga(id, manga);
    }

    //Operación para borrar un manga (D - DELETE)
    @DeleteMapping("/mangas/{id}")
    public String deleteProduct(@PathVariable Long id) {
        mangaServiceImpl.deleteMangaById(id);

        return "Deleted Successfully";
    }
}
