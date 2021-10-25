package com.AlejandroMartin.E07.repos;

import com.AlejandroMartin.E07.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
