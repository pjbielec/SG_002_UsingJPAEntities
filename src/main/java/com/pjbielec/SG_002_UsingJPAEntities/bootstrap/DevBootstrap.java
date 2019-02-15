package com.pjbielec.SG_002_UsingJPAEntities.bootstrap;

import com.pjbielec.SG_002_UsingJPAEntities.model.Author;
import com.pjbielec.SG_002_UsingJPAEntities.model.Book;

public class DevBootstrap {

    private void initData() {

        //Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("DDD", "1234", "Conan");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book neEJB = new Book("noEJB", "23456", "Carnage");
        rod.getBooks().add(neEJB);
    }
}
