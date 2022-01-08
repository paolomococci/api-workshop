package local.example.trolley.api.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "CARDS")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private long id;
}
