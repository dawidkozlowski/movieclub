package pl.javastart.movieclub.domain.rating;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.javastart.movieclub.domain.movie.Movie;
import pl.javastart.movieclub.domain.user.User;

@Entity
@Table(name = "movie_rating")
@Getter
@Setter
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
    private Integer rating;

    public Rating() {
    }

    public Rating(User user, Movie movie, Integer rating) {
        this.user = user;
        this.movie = movie;
        this.rating = rating;
    }
}
