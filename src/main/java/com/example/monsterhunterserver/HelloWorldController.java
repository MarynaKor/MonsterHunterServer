package com.example.monsterhunterserver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index(){
        return "Greeting!";
    }

    @GetMapping ("/newuser")
    public ResponseEntity<newUser> get(@RequestParam(value = "id") int id) {
        newUser newFirstUser = new newUser();
        newFirstUser.setId(id);
        newFirstUser.setUsername("Hans");
        newFirstUser.setHighScore(1567);
        return new ResponseEntity<newUser>(newFirstUser, HttpStatus.OK);
    }

    @PostMapping("/newuser")
        public ResponseEntity<newUser> create(@RequestBody newUser newFirstUser){
            //save user in DB
            return new ResponseEntity<newUser>(newFirstUser, HttpStatus.OK);
        }

}
