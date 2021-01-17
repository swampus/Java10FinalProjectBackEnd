package sda.finalproject.jgroup10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sda.finalproject.jgroup10.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
}