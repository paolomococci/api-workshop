package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@Data
@Entity
@Table(name = "PRODUCTS")
@EqualsAndHashCode(callSuper = true)
public class Product
        extends EntityTemplate
        implements Serializable {

    @Column(name = "NAME")
    @Basic(optional = false)
    @NotNull(message = "the name field cannot be null")
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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "PRODUCT_TAG",
            joinColumns = @JoinColumn(name = "PRODUCT_ID"),
            inverseJoinColumns = @JoinColumn(name = "TAG_ID")
    )
    private List<Tag> tags = Collections.emptyList();

    @OneToMany(mappedBy = "product")
    private List<Item> items;
}
