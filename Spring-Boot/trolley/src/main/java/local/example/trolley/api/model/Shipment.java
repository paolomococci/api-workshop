package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "SHIPMENTS")
@EqualsAndHashCode(callSuper = true)
public class Shipment
        extends EntityTemplate
        implements Serializable {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PROMISE")
    private Date promise;

    @Column(name = "ACHIEVE")
    @ColumnDefault(value = "false")
    private boolean achieve;

    @OneToOne(mappedBy = "shipment")
    private Order order;

    @OneToOne(mappedBy = "supplyShipment")
    private Supply supply;

    @ManyToMany(mappedBy = "shipments", fetch = FetchType.LAZY)
    private List<Forwarder> forwarders;
}
