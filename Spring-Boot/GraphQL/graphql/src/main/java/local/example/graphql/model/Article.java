package local.example.graphql.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue
    private int id;

    private String title;
    private String text;
    private String category;
    private int authorId;
}
