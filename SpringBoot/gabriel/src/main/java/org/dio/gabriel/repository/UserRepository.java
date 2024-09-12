package org.dio.gabriel.repository;

import org.dio.gabriel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
