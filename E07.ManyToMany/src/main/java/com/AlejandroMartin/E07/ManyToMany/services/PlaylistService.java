package com.AlejandroMartin.E07.ManyToMany.services;

import com.AlejandroMartin.E07.ManyToMany.model.Playlist;
import com.AlejandroMartin.E07.ManyToMany.repos.PlaylistRepository;
import com.AlejandroMartin.E07.ManyToMany.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService extends BaseService<Playlist,Long, PlaylistRepository> {
}
