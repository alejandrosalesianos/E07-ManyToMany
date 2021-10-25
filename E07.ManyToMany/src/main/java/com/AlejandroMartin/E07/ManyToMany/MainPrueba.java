package com.AlejandroMartin.E07.ManyToMany;

import com.AlejandroMartin.E07.ManyToMany.model.AddedTo;
import com.AlejandroMartin.E07.ManyToMany.model.Artist;
import com.AlejandroMartin.E07.ManyToMany.model.Playlist;
import com.AlejandroMartin.E07.ManyToMany.model.Song;
import com.AlejandroMartin.E07.ManyToMany.services.AddedToService;
import com.AlejandroMartin.E07.ManyToMany.services.ArtistService;
import com.AlejandroMartin.E07.ManyToMany.services.PlaylistService;
import com.AlejandroMartin.E07.ManyToMany.services.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class MainPrueba {

    private final ArtistService artistService;
    private final SongService songService;
    private final PlaylistService playlistService;
    private final AddedToService addedToService;

    @PostConstruct
    public void init() {
        Artist artista = Artist.builder()
                .name("Dj Bono")
                .build();
        artistService.save(artista);

        Playlist playlist = Playlist.builder()
                .name("Playlist to Wapa")
                .description("La mejor de todas")
                .build();
        playlistService.save(playlist);

        Song song = Song.builder()
                .album("Hola que tal")
                .title("Jorge Calvo")
                .year("1996")
                .build();
        song.addArtist(artista);
        songService.save(song);

        AddedTo addedTo = AddedTo.builder()
                .dateTime(LocalDateTime.now())
                .orden(1)
                .build();
        addedTo.addSongPlaylist(song,playlist);
        addedToService.save(addedTo);



    }
}
