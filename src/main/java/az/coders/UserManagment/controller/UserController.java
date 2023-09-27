package az.coders.UserManagment.controller;

import az.coders.UserManagment.model.User;
import az.coders.UserManagment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("all")
    public String getAllUser(Model model){
        model.addAttribute("users",userService.getAllUsers());
        return "users";
    }
    @GetMapping("register")
    public String register(Model model){
User user = new User();
model.addAttribute("user",user);
return "registration";
    }

    @PostMapping("saveUser")
    public String saveUser(@ModelAttribute("user") User user){
        userService.save(user);
        return "redirect:/";
    }
}
