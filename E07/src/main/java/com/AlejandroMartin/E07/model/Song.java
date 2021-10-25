package com.AlejandroMartin.E07.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class Song implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String album;

    private String year;

    @ManyToOne
    private Artist artist;

    @Builder.Default
    @OneToMany(mappedBy = "song", fetch = FetchType.EAGER)
    private List<AddedTo> addedTo = new ArrayList<>();

    //Helpers

    public void addArtist(Artist a){
        artist = a;
        if (a.getSongs() == null){
            a.setSongs(new ArrayList<>());
            a.getSongs().add(this);
        }
    }
    public void removeArtist(Artist a){
        artist=null;
        a.getSongs().remove(this);
    }

}
