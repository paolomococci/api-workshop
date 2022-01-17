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
}
