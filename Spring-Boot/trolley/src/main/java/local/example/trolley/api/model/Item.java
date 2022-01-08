package local.example.trolley.api.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "ITEMS")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private long id;
}
