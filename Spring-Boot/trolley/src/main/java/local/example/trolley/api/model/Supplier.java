package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

@Data
@Entity
@Table(name = "SUPPLIERS")
@EqualsAndHashCode(callSuper = true)
public class Supplier
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
}
