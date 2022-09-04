package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Table(name = "TAGS")
public class Tag
        extends EntityTemplate
        implements Serializable {

    @Column(name = "NAME")
    @Basic(optional = false)
    @NotNull(message = "the name field cannot be null")
    private String name;
}
