package local.example.trolley.api.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

import local.example.trolley.api.template.EntityTemplate;

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
}
