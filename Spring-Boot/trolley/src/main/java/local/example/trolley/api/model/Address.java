package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "ADDRESSES")
@EqualsAndHashCode(callSuper = true)
public class Address
        extends EntityTemplate
        implements Serializable {

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "STATE")
    private String state;

    @Column(name = "CITY")
    private String city;

    @Column(name = "TOWN")
    private String town;

    @Column(name = "ZIPCODE")
    private String zipcode;

    @Column(name = "STREET")
    private String street;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "RESIDENTIAL")
    private boolean residential;

    @OneToMany(
            mappedBy = "address",
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private List<Order> orders;
}
