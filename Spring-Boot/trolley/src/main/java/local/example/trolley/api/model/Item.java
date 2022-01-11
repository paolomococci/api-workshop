package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "ITEMS")
@EqualsAndHashCode(callSuper = true)
public class Item
        extends EntityTemplate
        implements Serializable {

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "AVAILABLE")
    @ColumnDefault(value = "false")
    private boolean available;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID")
    private Product product;

    @ManyToMany(mappedBy = "items", fetch = FetchType.LAZY)
    private List<Cart> cart;

    @ManyToMany(mappedBy = "items", fetch = FetchType.LAZY)
    private List<Order> orders;
}
