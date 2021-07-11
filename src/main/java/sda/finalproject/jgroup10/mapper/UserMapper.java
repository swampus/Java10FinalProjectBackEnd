
package sda.finalproject.jgroup10.mapper;

import org.springframework.stereotype.Component;
import sda.finalproject.jgroup10.dto.UserDTO;
import sda.finalproject.jgroup10.model.User;
import sda.finalproject.jgroup10.model.status.EntityStatus;

@Component
public class UserMapper {
    public UserDTO toDTO(User user) {
        if(user.getStatus() == null){
            user.setStatus(EntityStatus.DELETED);
        }
        return new UserDTO(
                user.getId(),
                user.getName(),
                user.getPersonalCode(),
                user.getAddress(),
                user.getPhone(),
                user.getEmail(),
                user.getNotes(),
                user.getStatus().name(),
                user.getCreateDate());

    }

    public User fromDTO(UserDTO userDTO) {
        return new User(
                userDTO.getName(),
                userDTO.getCode(),
                userDTO.getAddress(),
                userDTO.getPhone(),
                userDTO.getEmail(),
                userDTO.getNotes()
        );
    }
}
