package pl.devpo.tutorial.models;

import java.util.Optional;

public class Tag {

    private Optional<String> polishTranslation;
    private String title;

    public Tag(String title, String polishTranslation) {
        this.title = title;
        this.polishTranslation = Optional.ofNullable(polishTranslation);
    }

    public void callTagWithArticle(String articleTitle) {

        System.out.println("Tag: '"+ title +"' from '" + articleTitle + "' article!");

    }

    public Optional<String> getPolishTranslation() {
        return polishTranslation;
    }
}

