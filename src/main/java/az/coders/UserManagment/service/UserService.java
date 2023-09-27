package az.coders.UserManagment.service;

import az.coders.UserManagment.model.User;
import az.coders.UserManagment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getById(Integer id) {
        Optional<User> byId = userRepository.findById(id);
        return byId.get();
    }

    public void save(User user) {
        userRepository.save(user);
    }
}
