package com.userportal.resource;


import com.userportal.exception.domain.UserNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping("/home")
    public String showUser() throws UserNotFoundException {
        throw new UserNotFoundException("User not found");
    }




}
