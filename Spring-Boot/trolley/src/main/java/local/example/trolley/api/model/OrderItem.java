package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "CORRELATIONS")
public class OrderItem
        extends EntityTemplate
        implements Serializable {

    @Column(name = "ITEM")
    private UUID itemId;

    @Column(name = "ORDER")
    private UUID orderId;
}
