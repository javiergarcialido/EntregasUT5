package com.jgarcia.EntregasUT5;

import com.jgarcia.EntregasUT5.model.Manga;
import org.springframework.data.repository.CrudRepository;

public interface MangaRepository extends CrudRepository<Manga, Long> {
}
