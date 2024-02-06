package com.estech.backendtarea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estech.backendtarea.model.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Integer> {
    
}
