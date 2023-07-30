package dev.esu.springbootmovies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    List<Movie> findByReleaseDate(String releaseDate);
    Optional<Movie> findByImdbId(String imdbId);
}