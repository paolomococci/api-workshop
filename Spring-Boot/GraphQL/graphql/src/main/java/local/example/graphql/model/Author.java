package local.example.graphql.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Author {
    private String id;
    private String name;
    private String surname;
    private String nickname;
}
