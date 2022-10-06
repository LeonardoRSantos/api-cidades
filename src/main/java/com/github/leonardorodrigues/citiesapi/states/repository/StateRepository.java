package com.github.leonardorodrigues.citiesapi.states.repository;

import com.github.leonardorodrigues.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
