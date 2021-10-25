package com.AlejandroMartin.E07.services;

import com.AlejandroMartin.E07.model.AddedTo;
import com.AlejandroMartin.E07.model.AddedToPK;
import com.AlejandroMartin.E07.model.Playlist;
import com.AlejandroMartin.E07.model.Song;
import com.AlejandroMartin.E07.repos.AddedToRepository;
import com.AlejandroMartin.E07.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AddedToService extends BaseService<AddedTo, AddedToPK, AddedToRepository> {


    public Playlist AniadirCancion(Playlist p, Song s){
        s.getAddedTo().forEach(cancion ->{
            AddedTo a = AddedTo.builder()
                    .song(s)
                    .playlist(p)
                    .build();
            save(a);
        });

        return p;
    }
}
