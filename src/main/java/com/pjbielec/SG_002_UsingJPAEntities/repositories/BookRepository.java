package com.pjbielec.SG_002_UsingJPAEntities.repositories;

import com.pjbielec.SG_002_UsingJPAEntities.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
