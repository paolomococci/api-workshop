package local.example.impatiens.entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Impatiens
        extends PanacheEntity {

    public String cultivarName;
    public LocalDate developedDate;
    public LocalDate marketingDate;
    public CultivarStatus cultivarStatus;
}
