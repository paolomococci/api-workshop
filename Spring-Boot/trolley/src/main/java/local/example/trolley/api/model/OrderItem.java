package local.example.trolley.api.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "CORRELATIONS")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private long id;
}
