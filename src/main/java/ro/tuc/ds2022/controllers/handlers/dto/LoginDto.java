package ro.tuc.ds2022.controllers.handlers.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class LoginDto implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;
    private String username;
    private String password;
}
