package local.example.trolley.api.model;

import local.example.trolley.api.template.EntityTemplate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

@Data
@Entity
@Table(name = "SUPPLIES")
@EqualsAndHashCode(callSuper = true)
public class Supply
        extends EntityTemplate
        implements Serializable {
}
