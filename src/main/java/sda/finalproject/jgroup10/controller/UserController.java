package sda.finalproject.jgroup10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sda.finalproject.jgroup10.dto.UserDTO;
import sda.finalproject.jgroup10.mapper.UserMapper;
import sda.finalproject.jgroup10.model.User;
import sda.finalproject.jgroup10.service.UserService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
// Convection of sorts.
@RequestMapping("/rest/api/User.svc")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    @Autowired
    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/user({id})")
    public UserDTO getUserById(@PathVariable("id") Long id) {
        return userMapper.toDTO(userService.getUserById(id));
    }

    @PostMapping("/user")
    public UserDTO saveUser(@Valid @RequestBody UserDTO userDTO) {
        User userToSave = userMapper.fromDTO(userDTO);
        User savedUser = userService.save(userToSave);
        return userMapper.toDTO(savedUser);
    }

    @GetMapping("/users")
    public List<UserDTO> getAllUser() {
        List<User> users = userService.findAll();
        return users.stream().map(userMapper::toDTO)
                .collect(Collectors.toList());
    }

    @PutMapping("/user({id})")
    public void updateUser(@PathVariable("id") Long id,
                           @RequestBody UserDTO userToUpdateDTO) {
        userService.update(userMapper.fromDTO(userToUpdateDTO), id);
    }

    @GetMapping("/users/search")
    public List<UserDTO> searchUser(UserDTO userToUpdateDTO) {
        return userService.search(userMapper.fromDTO(userToUpdateDTO))
                .stream()
                .map(userMapper::toDTO)
                .collect(Collectors.toList());
    }

}