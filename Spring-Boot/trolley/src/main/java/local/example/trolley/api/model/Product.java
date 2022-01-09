package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "PRODUCTS")
public class Product
        extends EntityTemplate
        implements Serializable {

    @Column(name = "AVAILABLE")
    @ColumnDefault(value = "false")
    private boolean available;
}
