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
}
