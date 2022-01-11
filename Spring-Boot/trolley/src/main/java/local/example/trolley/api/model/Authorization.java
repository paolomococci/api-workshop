package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

import java.io.Serializable;

@Data
@Entity
@Table(name = "AUTHORIZATIONS")
@EqualsAndHashCode(callSuper = true)
public class Authorization
        extends EntityTemplate
        implements Serializable {

    @Column(name = "MESSAGE")
    private String message;

    @Column(name = "ERROR")
    private String error;

    @Column(name = "AUTHORIZED")
    private boolean authorized;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ID")
    private Order order;
}
