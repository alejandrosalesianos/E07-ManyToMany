package com.AlejandroMartin.E07;

import com.AlejandroMartin.E07.model.*;
//import com.AlejandroMartin.E07.services.AddedToService;
import com.AlejandroMartin.E07.services.ArtistService;
import com.AlejandroMartin.E07.services.PlaylistService;
import com.AlejandroMartin.E07.services.SongService;
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
    //private final AddedToService addedToService;

    @PostConstruct
    public void init(){
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



        //playlist = addedToService.AniadirCancion(playlist,song);


    }
}
