package com.everis.crud.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_animal")
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_animal", length = 5)
	private Long idAnimal;
	
	@Column(name = "nombre_animal", length = 50)
	private String nombre;
	
	@Column(name = "edad_animal", length = 5,nullable = true)
	private Integer edad;
	
	@Column(name = "especie_animal", length = 50)
	private String especie;
	
}
