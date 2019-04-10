package org.qlm.testjpa.service.imp;

import org.apache.catalina.User;
import org.qlm.testjpa.model.Users;
import org.qlm.testjpa.repository.UserRepository;
import org.qlm.testjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public List<Users> listUser() {
        return userRepository.findBy();
    }
}
