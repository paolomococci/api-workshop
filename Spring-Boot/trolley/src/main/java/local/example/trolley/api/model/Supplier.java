package local.example.trolley.api.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "SUPPLIERS")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private long id;
}
