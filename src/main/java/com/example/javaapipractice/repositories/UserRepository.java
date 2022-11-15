package com.example.javaapipractice.repositories;

import com.example.javaapipractice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
