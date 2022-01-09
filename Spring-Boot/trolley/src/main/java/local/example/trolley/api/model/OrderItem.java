package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "CORRELATIONS")
public class OrderItem
        extends EntityTemplate
        implements Serializable {
}
