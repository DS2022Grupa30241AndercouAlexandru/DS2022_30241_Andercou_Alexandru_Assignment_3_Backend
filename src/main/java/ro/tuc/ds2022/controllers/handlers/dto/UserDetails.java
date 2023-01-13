package ro.tuc.ds2022.controllers.handlers.dto;

import lombok.Data;
import ro.tuc.ds2022.entities.Device;
import ro.tuc.ds2022.entities.Role;

import javax.persistence.*;
import java.util.List;


@Data
public class UserDetails {

    private long Id;
    private String name;
    private Role role;
    private List<Device> devices;
    private String token;
}
