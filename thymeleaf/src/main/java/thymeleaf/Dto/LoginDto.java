package thymeleaf.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDto {
    private Integer userId;
    private String password;
}
