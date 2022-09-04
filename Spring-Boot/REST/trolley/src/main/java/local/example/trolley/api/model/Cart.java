package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Data
@Entity
@Table(name = "CARTS")
@EqualsAndHashCode(callSuper = true)
public class Cart
        extends EntityTemplate
        implements Serializable {

    @Column(name = "JOINED")
    @ColumnDefault(value = "true")
    private boolean joined;

    @OneToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    private User user;

    @ManyToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "CART_ITEM",
            joinColumns = @JoinColumn(name = "CART_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITEM_ID")
    )
    private List<Item> cartItems = Collections.emptyList();
}
