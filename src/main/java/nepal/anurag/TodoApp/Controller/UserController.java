package nepal.anurag.TodoApp.Controller;

import nepal.anurag.TodoApp.Entity.Task;
import nepal.anurag.TodoApp.Entity.User;
import nepal.anurag.TodoApp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

}
