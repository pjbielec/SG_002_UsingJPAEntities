package com.pjbielec.SG_002_UsingJPAEntities.repositories;

import com.pjbielec.SG_002_UsingJPAEntities.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
