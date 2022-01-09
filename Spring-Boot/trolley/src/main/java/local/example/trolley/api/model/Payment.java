package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "PAYMENTS")
public class Payment
        extends EntityTemplate
        implements Serializable {

    @Column(name = "PAID")
    @ColumnDefault(value = "false")
    private boolean paid;
}
