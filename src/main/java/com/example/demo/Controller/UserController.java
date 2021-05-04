package com.example.demo.Controller;

import com.example.demo.Model.Video;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Services.UserServices;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.Model.User;
import com.example.demo.Respotivy.UsertRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.*;
import org.springframework.stereotype.Controller;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/demo") // This means URL's start with /demo (after Application path)
public class UserController {

    @Autowired
    private UserServices userServices;
//    private final Logger log = LoggerFactory.getLogger(UserController.class);

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping(value = {""})
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
//    @CrossOrigin(origins = "http://localhost:3000")

    @GetMapping(path = "/users")
    public @ResponseBody
    List<User> getAllUsers() {
        return userServices.getAllUser();
    }


    @GetMapping(path = "/users?username={username}")
    public @ResponseBody List<User> getUserName(String username) {
        return userServices.getUserName(username);
    }


    //    @GetMapping(value = "/users/{userid}")
//    public User getProduct(@PathVariable(name = "userid") Integer userid) {
//        return userServices.getUser(userid);
//    }
    // POST
    @PostMapping(value = "/users")
    public void save(@RequestBody User us) {
        System.err.println(us);
        userServices.addUser(us);
    }

}
