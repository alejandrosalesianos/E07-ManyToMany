package com.AlejandroMartin.E07.ManyToMany.repos;

import com.AlejandroMartin.E07.ManyToMany.model.AddedTo;
import com.AlejandroMartin.E07.ManyToMany.model.AddedToPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddedToRepository extends JpaRepository<AddedTo, AddedToPK> {
}
