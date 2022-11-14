package local.example.graphql.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "authors")
public class Author {
    private String id;
    private String name;
    private String surname;
    private String nickname;
}
