package local.example.graphql.repository;

import local.example.graphql.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository
        extends CrudRepository<Author, Integer> {
}
