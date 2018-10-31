package net.kazanok.shop.controller;

import net.kazanok.shop.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    /*@PostMapping("/user")
    @ResponseBody
    public String getUser(@RequestBody User user) {
        System.out.println("Password: " + user.getPassword());
        return "User mapping";
    }

    @GetMapping("/shop")
    @ResponseBody
    public String get() {
        System.out.println("Get mapping!");
        return "Shop here!";
    }*/
}
