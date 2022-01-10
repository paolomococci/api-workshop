package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "PRODUCTS")
@EqualsAndHashCode(callSuper = true)
public class Product
        extends EntityTemplate
        implements Serializable {

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "STOCK")
    private String stock;

    @Column(name = "IMAGE")
    private String imageUri;

    @Column(name = "AVAILABLE")
    @ColumnDefault(value = "false")
    private boolean available;
}
