package com.AlejandroMartin.E07.repos;

import com.AlejandroMartin.E07.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface SongRepository extends JpaRepository<Song, Long> {
}
