
package com.example.coplur_assignment.Controller;

import com.example.coplur_assignment.model.UserDTO;
import com.example.coplur_assignment.Service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.coplur_assignment.Service.*;
@CrossOrigin(origins = "http://localhost:5173")


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserManager userManager;


    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(userManager.getUserById(id));
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UserDTO user) {
        return ResponseEntity.ok(userManager.createUser(user));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody UserDTO user) {
        return ResponseEntity.ok(userManager.updateUser(id, user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        return ResponseEntity.ok(userManager.deleteUser(id));
    }
}
