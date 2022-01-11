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
@Table(name = "USERS")
@EqualsAndHashCode(callSuper = true)
public class User
        extends EntityTemplate
        implements Serializable {

    @Column(name = "USERNAME")
    @Basic(optional = false)
    @NotNull(message = "the username field cannot be null")
    private String username;

    @Column(name = "PASSWORD")
    @Basic(optional = false)
    @NotNull(message = "the password field cannot be null")
    private String password;

    @Column(name = "EMAIL")
    @Basic(optional = false)
    @NotNull(message = "the email field cannot be null")
    private String email;

    @Column(name = "ACTIVE")
    @ColumnDefault(value = "false")
    private boolean active;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "USER_ADDRESS",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ADDRESS_ID")
    )
    private List<Address> addresses = Collections.emptyList();

    @OneToMany(
            mappedBy = "user",
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private List<Card> cards;

    @OneToOne(
            mappedBy = "user",
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private Cart cart;

    @OneToMany(
            mappedBy = "userEntity",
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private List<Order> orders;
}
