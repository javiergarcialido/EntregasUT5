package com.jgarcia.EntregasUT5;

import com.jgarcia.EntregasUT5.model.Manga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MangaServiceImpl implements MangaService {
    @Autowired
    private MangaRepository mangaRepository;

    public ArrayList<Manga> findAll() {
        return (ArrayList<Manga>) mangaRepository.findAll();
    }

    public Optional<Manga> findById(Long id) {
        return mangaRepository.findById(id);
    }

    public void saveManga(Manga manga) {
        mangaRepository.save(manga);
    }

    public Manga updateManga(Long id, Manga manga) {
        if(mangaRepository.findById(id) != null){
            mangaRepository.save(manga);
            return manga;
        }

        return null;
    }

    public void deleteMangaById(Long id) {
        mangaRepository.deleteById(id);
    }
}
