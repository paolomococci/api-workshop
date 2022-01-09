package local.example.trolley.api.model;

import lombok.Getter;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "CARTS")
public class Cart {

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

    @Column(name = "JOINED")
    @ColumnDefault(value = "true")
    private boolean joined;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "STARTED")
    private Timestamp started;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED")
    private Timestamp updated;
}
