package com.github.leonardorodrigues.citiesapi.states.resources;

import com.github.leonardorodrigues.citiesapi.states.entities.State;
import com.github.leonardorodrigues.citiesapi.states.repository.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResource {

    private final StateRepository repository;

    public StateResource(StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> staties(){
        return repository.findAll();
    }
}
