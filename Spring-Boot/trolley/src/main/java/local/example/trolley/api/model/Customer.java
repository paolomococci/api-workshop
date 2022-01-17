package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "CUSTOMERS")
@EqualsAndHashCode(callSuper = true)
public class Customer
        extends EntityTemplate
        implements Serializable {

    @Column(name = "NAME")
    @Basic(optional = false)
    @NotNull(message = "the name field cannot be null")
    private String name;

    @Column(name = "SURNAME")
    @Basic(optional = false)
    @NotNull(message = "the surname field cannot be null")
    private String surname;

    @Column(name = "PHONE")
    @Basic(optional = false)
    @NotNull(message = "the phone field cannot be null")
    private String phone;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

}
