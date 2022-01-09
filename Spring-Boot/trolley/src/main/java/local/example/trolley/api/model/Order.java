package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "ORDERS")
public class Order
        extends EntityTemplate
        implements Serializable {

    @Column(name = "PROCESSED")
    @ColumnDefault(value = "false")
    private boolean processed;
}
