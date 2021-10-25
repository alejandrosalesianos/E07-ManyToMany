package com.AlejandroMartin.E07.services;

import com.AlejandroMartin.E07.model.Playlist;
import com.AlejandroMartin.E07.repos.PlaylistRepository;
import com.AlejandroMartin.E07.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService extends BaseService<Playlist,Long, PlaylistRepository> {
}
