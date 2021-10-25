package com.AlejandroMartin.E07.ManyToMany.services;

import com.AlejandroMartin.E07.ManyToMany.model.Artist;
import com.AlejandroMartin.E07.ManyToMany.repos.ArtistRepository;
import com.AlejandroMartin.E07.ManyToMany.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ArtistService extends BaseService<Artist,Long, ArtistRepository> {
}
