package pl.javastart.movieclub.domain.movie;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import pl.javastart.movieclub.domain.genre.Genre;
import jakarta.persistence.*;
import pl.javastart.movieclub.domain.rating.Rating;

import java.sql.Types;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String originalTitle;
    private String shortDescription;
    private String description;
    private String youtubeTrailerId;
    private Integer releaseYear;
    @ManyToOne
    @JoinColumn(name = "genre_id", referencedColumnName = "id")
    private Genre genre;
    @OneToMany(mappedBy = "movie")
    private Set<Rating> ratings = new HashSet<>();
    @JdbcTypeCode(Types.TINYINT)
    private boolean promoted;
    private String poster;
}