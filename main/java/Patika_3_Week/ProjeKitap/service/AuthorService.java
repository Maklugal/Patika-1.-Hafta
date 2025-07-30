package Patika_3_Week.ProjeKitap.service;

import Patika_3_Week.ProjeKitap.model.Author;
import Patika_3_Week.ProjeKitap.model.enums.Gender;

import java.util.HashMap;
import java.util.Map;

public class AuthorService {

    private static final Map<String, Author> authors = new HashMap();

    public void create(String name, String surname, Gender gender) {

        Author author = new Author(name, surname, gender);
        authors.put(author.getName(), author);
    }

    public Author findAuthor(String name) {
        return authors.get(name);

    }

}
