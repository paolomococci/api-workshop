package local.example.impatiens.entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import io.smallrye.mutiny.Uni;

import javax.persistence.Entity;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Impatiens
        extends PanacheEntity {

    public String cultivarName;
    public LocalDate developedDate;
    public LocalDate marketingDate;
    public CultivarStatus cultivarStatus;

    public static Uni<List<Impatiens>> readAllTrendy() {
        return Impatiens.list("cultivarStatus", CultivarStatus.TRENDY);
    }
}
