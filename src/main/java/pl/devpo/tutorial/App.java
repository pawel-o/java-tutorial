package pl.devpo.tutorial;

import io.vavr.collection.List;
import pl.devpo.tutorial.models.Article;
import pl.devpo.tutorial.models.Tag;

import java.util.Optional;

public class App {

    public static void main(String[] args) {

        List<Article> weeklyArticles = List.of(new Article("Football stadium weekly report", new Tag("Football", "Pilka Nozna")),
                new Article("weekly report", new Tag("Volleyball", null)));

        Optional<Article> article = Optional.of(weeklyArticles.get(0));
        getOptionalApiVersion(article);
        getMonadVersion(article);
        
    }

    private static void getMonadVersion(Optional<Article> article) {
        article.flatMap( a -> a.getTag() ).flatMap(t -> t.getPolishTranslation()).ifPresent(pt -> System.out.println(pt));
    }

    private static void getOptionalApiVersion(Optional<Article> article) {
        if ( article.isPresent()) {
            Optional<Tag> tag = article.get().getTag();
            if ( tag.isPresent() ) {
                Optional<String> polishTranslation = tag.get().getPolishTranslation();
                if (polishTranslation.isPresent() ) {
                    System.out.println(polishTranslation.get());
                }
            }
        }
    }
}
