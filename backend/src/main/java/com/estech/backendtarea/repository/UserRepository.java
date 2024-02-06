package com.estech.backendtarea.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estech.backendtarea.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
