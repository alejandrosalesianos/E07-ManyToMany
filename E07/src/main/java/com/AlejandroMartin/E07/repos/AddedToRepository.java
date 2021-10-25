package com.AlejandroMartin.E07.repos;

import com.AlejandroMartin.E07.model.AddedTo;
import com.AlejandroMartin.E07.model.AddedToPK;
import com.AlejandroMartin.E07.model.Playlist;
import com.AlejandroMartin.E07.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddedToRepository extends JpaRepository<AddedTo, AddedToPK> {
}
