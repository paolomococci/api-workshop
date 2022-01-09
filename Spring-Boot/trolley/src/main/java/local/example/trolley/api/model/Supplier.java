package local.example.trolley.api.model;

import lombok.Getter;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "SUPPLIERS")
public class Supplier {

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

    @Column(name = "ACTIVE")
    @ColumnDefault(value = "false")
    private boolean active;

    @Column(name = "REGISTERED")
    private Timestamp registered;
}
