package com.carlospereira.workshopmongo.resources;

import com.carlospereira.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User carlos = new User("1", "Carlos", "teste@gmail");
        User joao = new User("2", "Joao", "teste@gmail");
        return ResponseEntity.ok().body(new ArrayList<>(Arrays.asList(carlos, joao)));
    }
}
