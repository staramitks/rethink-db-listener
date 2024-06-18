package home.amit.rethinkdb.stream.rethink.controller;
/*
User :- AmitSingh
Date :- 5/31/2024
Time :- 5:51 PM
Year :- 2024
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping
    public String getHelloWorld(){
        return "Hello RethinkDB Change Listener";
    }


}
