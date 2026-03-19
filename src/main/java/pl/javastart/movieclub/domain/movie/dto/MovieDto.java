package pl.javastart.movieclub.domain.movie.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieDto {
    private Long id;
    private String title;
    private String originalTitle;
    private Integer releaseYear;
    private String genre;
    private boolean promoted;

    public MovieDto(Long id, String title, String originalTitle, Integer releaseYear, String genre, boolean promoted) {
        this.id = id;
        this.title = title;
        this.originalTitle = originalTitle;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.promoted = promoted;
    }
}