package sda.finalproject.jgroup10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;
import sda.finalproject.jgroup10.exception.FinalProjectServiceException;
import sda.finalproject.jgroup10.model.User;
import sda.finalproject.jgroup10.model.status.EntityStatus;
import sda.finalproject.jgroup10.repository.UserRepository;

import java.util.List;

@Component
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) {

        if (id == 13) {
            throw new FinalProjectServiceException("13 is not allowed", "CODE_2");
        }
        return userRepository.findById(id).orElseThrow(
                () -> new FinalProjectServiceException("13 is not allowed", "CODE_1"));
    }

    public User save(User user) {
        user.setStatus(EntityStatus.ACTIVE);
        user.setCreateDate(null);
        return userRepository.save(user);
    }

    public void delete(Long id) {
        User userFromDb = userRepository.getOne(id);
        userFromDb.setStatus(EntityStatus.DELETED);
        userRepository.save(userFromDb);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void update(User user, Long id) {

        userRepository.findById(id)
                .orElseThrow(() -> new FinalProjectServiceException("User not exists: " + id, "CODE_3"));

        user.setId(id);
        userRepository.save(user);
    }

    public List<User> search(User userSearch) {
        Example<User> userExample = Example.of(userSearch);
        return userRepository.findAll(userExample);
    }
}