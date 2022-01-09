package local.example.trolley.api.template;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
public abstract class EntityTemplate {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(
            name = "ID",
            updatable = false,
            nullable = false
    )
    @Type(type = "uuid-char")
    @Getter
    private UUID id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REGISTERED", nullable = false)
    @Getter
    private Timestamp registered;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED", nullable = false)
    @Getter
    @Setter
    private Timestamp updated;

    @PrePersist
    protected void onInit() {
        this.registered = Timestamp.valueOf(LocalDateTime.now());
    }
}
