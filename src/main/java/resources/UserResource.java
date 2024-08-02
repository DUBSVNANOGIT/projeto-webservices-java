package resources;

import entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@g", "999999999", "123455");
        return ResponseEntity.ok().body(u);
    }

    @GetMapping
    public User getUser() {
        User u = new User(1L, "Maria", "maria@g", "999999999", "123455");
        return u;
    }

}
