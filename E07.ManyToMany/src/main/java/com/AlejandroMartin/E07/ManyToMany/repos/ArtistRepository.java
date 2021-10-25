package com.AlejandroMartin.E07.ManyToMany.repos;

import com.AlejandroMartin.E07.ManyToMany.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
