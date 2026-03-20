package pl.javastart.movieclub.domain.user.dto;

import lombok.Getter;

import java.util.Set;

@Getter
public class UserCredentialsDto {
    private final String email;
    private final String password;
    private final Set<String> roles;

    public UserCredentialsDto(String email, String password, Set<String> roles) {
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

}