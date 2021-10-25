package com.AlejandroMartin.E07.ManyToMany.model;

import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class Playlist implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;


    @Builder.Default
    @OneToMany(mappedBy = "playlist")
    private List<AddedTo> addedTo = new ArrayList<>();
}
