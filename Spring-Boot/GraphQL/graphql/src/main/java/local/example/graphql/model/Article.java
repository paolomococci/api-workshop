package local.example.graphql.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Article {
    private String id;
    private String title;
    private String text;
    private String category;
    private String authorId;
}
