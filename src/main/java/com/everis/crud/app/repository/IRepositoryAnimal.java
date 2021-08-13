package com.everis.crud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.crud.app.domain.Animal;

@Repository
public interface IRepositoryAnimal extends JpaRepository<Animal, Long>{

}
