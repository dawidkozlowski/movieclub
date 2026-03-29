package pl.javastart.movieclub.domain.user.dto;

import lombok.Data;

@Data
public class UserRegistrationDto {
    private String email;
    private String password;
}