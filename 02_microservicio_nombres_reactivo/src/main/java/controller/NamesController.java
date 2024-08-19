package controller;


import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
public class NamesController {


    public Flux<String> getName(){
        List<String> name = List.of("One", "Two", "Three", "Four", "Five");
        return Flux.fromIterable(name);
    }
}
