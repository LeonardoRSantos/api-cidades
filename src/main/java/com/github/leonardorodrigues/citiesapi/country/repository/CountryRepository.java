package com.github.leonardorodrigues.citiesapi.country.repository;

import com.github.leonardorodrigues.citiesapi.country.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
