package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Data
@Entity
@Table(name = "FORWARDERS")
@EqualsAndHashCode(callSuper = true)
public class Forwarder
        extends EntityTemplate
        implements Serializable {

    @Column(name = "NAME")
    @Basic(optional = false)
    @NotNull(message = "the name field cannot be null")
    private String name;

    @Column(name = "EMAIL")
    @Basic(optional = false)
    @NotNull(message = "the email field cannot be null")
    private String email;

    @Column(name = "PHONE")
    @Basic(optional = false)
    @NotNull(message = "the phone field cannot be null")
    private String phone;

    @Column(name = "ACTIVE")
    @ColumnDefault(value = "false")
    private boolean active;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "FORWARDER_SHIPMENT",
            joinColumns = @JoinColumn(name = "FORWARDER_ID"),
            inverseJoinColumns = @JoinColumn(name = "SHIPMENT_ID")
    )
    private List<Shipment> shipments = Collections.emptyList();
}
