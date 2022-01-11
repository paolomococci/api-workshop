package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

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

    @OneToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    private User user;

    @OneToMany(
            mappedBy = "card",
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private List<Order> orders;
}
