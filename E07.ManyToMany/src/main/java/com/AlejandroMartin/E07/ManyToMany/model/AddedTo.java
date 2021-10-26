package com.AlejandroMartin.E07.ManyToMany.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
@EntityListeners(AuditingEntityListener.class)
public class AddedTo {

    @Builder.Default
    @EmbeddedId
    private AddedToPK id = new AddedToPK();

    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name="song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name="playlist_id")
    private Playlist playlist;

    @CreatedDate
    private LocalDateTime dateTime;

    private int orden;

    //Helpers

    public void addSong(Song s){
        song = s;
        s.getAddedTo().add(this);
    }
    public void removeSong(Song s){
        song = s;
        s.getAddedTo().remove(this);
    }
    public void addPlaylist(Playlist p){
        playlist = p;
        p.getAddedTo().add(this);
    }
    public void removePlaylist(Playlist p){
        playlist = p;
        p.getAddedTo().remove(this);
    }
    public void addSongPlaylist(Song s, Playlist p){
        addSong(s);
        addPlaylist(p);
    }
    public void removeSongPlaylist(Song s, Playlist p){
        removePlaylist(p);
        removeSong(s);
    }
}
