package com.everis.crud.app.service;

import java.util.List;

import com.everis.crud.app.domain.Animal;


public interface IAnimalService {

	//metodos abstractos por defecto
	public Animal guardarAnimal(Animal a);
	public List<Animal> listarAnimal();
	public Animal actualizarAnimal(Animal a);
	public void eliminarAnimal(Long id);
	public Animal buscarAnimal(Long id);
}
