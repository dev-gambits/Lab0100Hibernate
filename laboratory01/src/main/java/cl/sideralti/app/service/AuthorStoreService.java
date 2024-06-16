package cl.sideralti.app.service;

import cl.sideralti.app.entities.AuthorEntity;
import cl.sideralti.app.enums.GenreType;
import cl.sideralti.app.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorStoreService {

    private final AuthorRepository authorRepository;

    public AuthorStoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void persistNewAuthor() {
        AuthorEntity author = new AuthorEntity();

        author.setName("Jorge Luis Borges");
        author.setAge(55);
        author.setGenre(GenreType.HISTORY);

        authorRepository.save(author);
    }

    public void fetchAuthor() {
        AuthorEntity author = authorRepository.findById(1L).orElseThrow();
        System.out.println(author);
    }

    public void fetchAllAuthor() {
        List<AuthorEntity> author = (List<AuthorEntity>) authorRepository.findAll();
        System.out.println(author);
    }


}
