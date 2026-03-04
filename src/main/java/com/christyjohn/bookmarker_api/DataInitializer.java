package com.christyjohn.bookmarker_api;

import com.christyjohn.bookmarker_api.domain.Bookmark;
import com.christyjohn.bookmarker_api.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookmarkRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Bookmark(null, "SivaLabs", "https://sivalabs.in", Instant.now()));
        repository.save(new Bookmark(null, "Spring Blog", "https://spring.io/blog", Instant.now()));
        repository.save(new Bookmark(null, "Quarkus", "https://quarkus.io/", Instant.now()));
        repository.save(new Bookmark(null, "Micronaut", "https://micronaut.io/", Instant.now()));
        repository.save(new Bookmark(null, "JOOQ", "https://www.jooq.org/", Instant.now()));
        repository.save(new Bookmark(null, "Vlad Mihalcea", "https://vladmihalcea.com", Instant.now()));
        repository.save(new Bookmark(null, "Thoughts on Java", "https://thorben-janssen.com/", Instant.now()));
        repository.save(new Bookmark(null, "DZone", "https://dzone.com/", Instant.now()));
        repository.save(new Bookmark(null, "Dev Ops Bookmarks", "https://www.devopsbookmarks.com/", Instant.now()));
        repository.save(new Bookmark(null, "Kubernetes Docs", "https://kubernetes.io/docs/home/", Instant.now()));
        repository.save(new Bookmark(null, "ExpressJs", "https://expressjs.com/", Instant.now()));
        repository.save(new Bookmark(null, "Marco Behler", "https://marcobehler.com", Instant.now()));
        repository.save(new Bookmark(null, "Baeldung", "https://www.baeldung.com", Instant.now()));
        repository.save(new Bookmark(null, "Dev Glan", "https://devglan.com", Instant.now()));
        repository.save(new Bookmark(null, "Linuxize", "https://linuxize.com", Instant.now()));
    }
}
