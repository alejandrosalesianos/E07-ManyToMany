package com.AlejandroMartin.E07.ManyToMany.repos;

import com.AlejandroMartin.E07.ManyToMany.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
