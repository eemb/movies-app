package dev.esu.springbootmovies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired // tells the framework to instantiate this class for us
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(ObjectId id){
        return movieRepository.findById(id);
    }

    public Optional<Movie> getMovieByImdbId(String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }


    public List<Movie> getMoviesByReleaseDate(String releaseDate) {
        LocalDate date = LocalDate.parse(releaseDate); // converta a string para LocalDate
        return movieRepository.findByReleaseDate(String.valueOf(date));
    }

}
