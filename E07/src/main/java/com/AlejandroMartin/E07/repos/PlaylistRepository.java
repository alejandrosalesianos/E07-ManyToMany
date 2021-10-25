package com.AlejandroMartin.E07.repos;

import com.AlejandroMartin.E07.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
