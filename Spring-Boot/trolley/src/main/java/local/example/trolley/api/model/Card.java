package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

@Data
@Entity
@Table(name = "CARDS")
@EqualsAndHashCode(callSuper = true)
public class Card
        extends EntityTemplate
        implements Serializable {

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "EXPIRES")
    private String expires;

    @Column(name = "CSC")
    private String csc;
}
