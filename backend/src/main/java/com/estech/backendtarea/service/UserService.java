package com.estech.backendtarea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estech.backendtarea.model.Usuario;
import com.estech.backendtarea.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    
    public List<Usuario> listaUsuarios(){
        return userRepository.findAll();
    }

}
