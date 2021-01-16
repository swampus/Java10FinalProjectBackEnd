
package sda.finalproject.jgroup10.mapper;

import org.springframework.stereotype.Component;
import sda.finalproject.jgroup10.dto.UserDTO;
import sda.finalproject.jgroup10.model.User;

@Component
public class UserMapper {
    public UserDTO toDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getName(),
                user.getPersonalCode(),
                user.getAddress(),
                user.getPhone(),
                user.getEmail(),
                user.getNotes()
        );
    }

    public User fromDTO(UserDTO userDTO) {
        return new User(
                null,
                userDTO.getName(),
                userDTO.getPersonalCode(),
                userDTO.getAddress(),
                userDTO.getPhone(),
                userDTO.getEmail(),
                userDTO.getNotes()
        );
    }
}
