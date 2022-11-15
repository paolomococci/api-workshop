package local.example.graphql.model;

import lombok.Data;

@Data
public class Author {
    private String id;
    private String name;
    private String surname;
    private String nickname;
}
