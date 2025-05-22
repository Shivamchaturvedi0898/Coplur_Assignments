
package com.example.coplur_assignment.Service;

import com.example.coplur_assignment.model.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class UserManager {

    public UserDTO getUserById(Long id) {
        // Mock data for demonstration
        return new UserDTO("Shivam", "shivam@example.com");
    }

    public String createUser(UserDTO user) {
        return "User created: " + user.getName();
    }

    public String updateUser(Long id, UserDTO user) {
        return "User with ID " + id + " updated.";
    }

    public String deleteUser(Long id) {
        return "User with ID " + id + " deleted.";
    }
}

