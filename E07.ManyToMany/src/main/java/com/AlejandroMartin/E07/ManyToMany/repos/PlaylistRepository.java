package com.AlejandroMartin.E07.ManyToMany.repos;

import com.AlejandroMartin.E07.ManyToMany.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
