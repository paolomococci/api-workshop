package local.example.trolley.api.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTS")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private long id;
}
