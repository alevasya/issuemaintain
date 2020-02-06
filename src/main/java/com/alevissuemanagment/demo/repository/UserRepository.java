package com.alevissuemanagment.demo.repository;

import com.alevissuemanagment.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository< User, Long> {
    List<User> getAllByUsername(String username);
    User findByUsername(String username);
}
