package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

@Data
@Entity
@Table(name = "CUSTOMERS")
@EqualsAndHashCode(callSuper = true)
public class Customer
        extends EntityTemplate
        implements Serializable {

    @Column(name = "ACTIVE")
    @ColumnDefault(value = "false")
    private boolean active;
}
