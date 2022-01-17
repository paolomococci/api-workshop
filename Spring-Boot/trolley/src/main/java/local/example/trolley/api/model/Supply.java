package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "SUPPLIES")
@EqualsAndHashCode(callSuper = true)
public class Supply
        extends EntityTemplate
        implements Serializable {

    @Column(name = "TOTAL")
    private BigDecimal total;

    @Column(name = "PROCESSED")
    @ColumnDefault(value = "false")
    private boolean processed;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="SUPPLIER_ID", nullable=false)
    private Supplier supplier;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(
            name = "ADDRESS_ID",
            referencedColumnName = "ID",
            insertable=false,
            updatable=false
    )
    private Address supplyAddress;

    @OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "PAYMENT_ID", referencedColumnName = "ID")
    private Payment supplyPayment;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "ID")
    private Shipment supplyShipment;
}
