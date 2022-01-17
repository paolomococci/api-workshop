package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@Data
@Entity
@Table(name = "ORDERS")
@EqualsAndHashCode(callSuper = true)
public class Order
        extends EntityTemplate
        implements Serializable {

    @Column(name = "TOTAL")
    private BigDecimal total;

    @Column(name = "PROCESSED")
    @ColumnDefault(value = "false")
    private boolean processed;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="CUSTOMER_ID", nullable=false)
    private User customer;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(
            name = "ADDRESS_ID",
            referencedColumnName = "ID",
            insertable=false,
            updatable=false
    )
    private Address address;

    @OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "PAYMENT_ID", referencedColumnName = "ID")
    private Payment payment;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "ID")
    private Shipment shipment;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "CARD_ID", referencedColumnName = "ID")
    private Card card;

    @ManyToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "ORDER_ITEM",
            joinColumns = @JoinColumn(name = "ORDER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITEM_ID")
    )
    private List<Item> orderItems = Collections.emptyList();

    @OneToOne(mappedBy = "order")
    private Authorization authorization;
}
