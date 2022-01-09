package local.example.trolley.api.model;

import lombok.Getter;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "SHIPMENTS")
public class Shipment {

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

    @Column(name = "ACHIEVE")
    @ColumnDefault(value = "false")
    private boolean achieve;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REGISTERED")
    private Timestamp registered;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED")
    private Timestamp updated;
}
