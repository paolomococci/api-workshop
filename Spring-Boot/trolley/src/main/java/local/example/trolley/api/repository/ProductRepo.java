package local.example.trolley.api.repository;

import local.example.trolley.api.model.Product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepo
        extends CrudRepository<Product, Long> {
}
