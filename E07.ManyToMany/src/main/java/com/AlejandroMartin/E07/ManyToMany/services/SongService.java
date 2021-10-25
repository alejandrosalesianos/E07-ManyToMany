package com.AlejandroMartin.E07.ManyToMany.services;

import com.AlejandroMartin.E07.ManyToMany.model.Song;
import com.AlejandroMartin.E07.ManyToMany.repos.SongRepository;
import com.AlejandroMartin.E07.ManyToMany.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SongService extends BaseService<Song, Long, SongRepository> {
}
