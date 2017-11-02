package pl.devpo.tutorial.models;

import java.util.Optional;

public class Article {

    private String title;

    private Optional<Tag> tag;

    public Article(String title, Tag tag) {

        this.title = title;
        this.tag = Optional.of(tag);
}

    public Article(String title) {

        this.title = title;
        this.tag = Optional.empty();
    }

    public Optional<Tag> getTag() {
        return tag;
    }

    public String getTitle() {
        return title;
    }
}
