package com.example.monsterhunterserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HelloWorldController {

    @Autowired
    private ScoresRepository scoresRepository;

    @GetMapping("/")
    public String index(){
        return "Greeting!";
    }

    @GetMapping ("/newuser")
    public ResponseEntity<newUser> get(@RequestParam(value = "id") int id) {
        // get User by ID
        Optional<newUser> userInScoresDB = scoresRepository.findById(id);
        if(userInScoresDB.isPresent()){
            return new ResponseEntity<newUser>(userInScoresDB.get(), HttpStatus.OK);
        }
        return new ResponseEntity("no User found with id " + id, HttpStatus.NOT_FOUND);
    }
    @GetMapping("/scoreList")
    public ResponseEntity<Iterable<newUser>> getALL(){
        Iterable<newUser> allUsersAndScores = scoresRepository.findAll();
        return new ResponseEntity<Iterable<newUser>>(allUsersAndScores,HttpStatus.OK);
    }


    @PostMapping("/newuser")
        public ResponseEntity<newUser> create(@RequestBody newUser newFirstUser){
            //save user in DB
            scoresRepository.save(newFirstUser);
            return new ResponseEntity<newUser>(newFirstUser, HttpStatus.OK);
        }

}
