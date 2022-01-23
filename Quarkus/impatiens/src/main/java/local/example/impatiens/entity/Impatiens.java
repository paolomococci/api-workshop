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

    public static Uni<List<Impatiens>> readAllAlive() {
        return Impatiens.list("cultivarStatus", CultivarStatus.ALIVE);
    }

    public static Uni<List<Impatiens>> readAllJustDiscovered() {
        return Impatiens.list("cultivarStatus", CultivarStatus.JUST_DISCOVERED);
    }

    public static Uni<List<Impatiens>> readAllAbandoned() {
        return Impatiens.list("cultivarStatus", CultivarStatus.ABANDONED);
    }
}
