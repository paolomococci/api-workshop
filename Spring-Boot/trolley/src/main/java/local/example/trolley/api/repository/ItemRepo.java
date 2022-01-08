package local.example.trolley.api.repository;

import local.example.trolley.api.model.Item;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface ItemRepo
        extends CrudRepository<Item, UUID> {
}
