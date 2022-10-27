package com.codegym.dating.dto;

import com.codegym.dating.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostDto implements Validator {
    private Integer idPost;
    @NotBlank(message = "Vui lòng nhập vào")
    @Size(max = 200,message = "Trạng thái không quá 200 ký tự")
//    @Max(value = 200 ,message = "Trạng thái không quá 200 ký tự")
    private String content;
    private String media;
    private LocalDateTime time;
    private User user;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
