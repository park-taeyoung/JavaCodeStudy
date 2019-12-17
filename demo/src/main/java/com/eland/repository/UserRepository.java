package com.eland.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eland.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
