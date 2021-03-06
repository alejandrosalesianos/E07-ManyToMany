package com.AlejandroMartin.E07.ManyToMany.model;

import lombok.*;

import javax.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class AddedToPK implements Serializable {

    private Long song_id;

    private Long playlist_id;
}
