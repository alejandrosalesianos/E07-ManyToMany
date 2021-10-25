package com.AlejandroMartin.E07.services;

import com.AlejandroMartin.E07.model.Song;
import com.AlejandroMartin.E07.repos.SongRepository;
import com.AlejandroMartin.E07.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SongService extends BaseService<Song, Long, SongRepository> {
}
