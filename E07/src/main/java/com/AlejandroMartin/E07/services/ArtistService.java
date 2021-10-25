package com.AlejandroMartin.E07.services;

import com.AlejandroMartin.E07.model.Artist;
import com.AlejandroMartin.E07.repos.ArtistRepository;
import com.AlejandroMartin.E07.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ArtistService extends BaseService<Artist,Long, ArtistRepository> {
}
