package local.example.graphql.model;

import lombok.Data;

@Data
public class Article {
    private String id;
    private String title;
    private String text;
    private String category;
    private String authorId;
}
