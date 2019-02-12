package com.Alberto.Trabajo3_1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Table(name="autor")

public class Autor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	@Column(name="nombre")
	String nombre;
	
	List <Juego> juegos;
	@ManyToMany(cascade=CascadeType.DETACH,mappedBy="autor")
	public List<Juego>getJuegos(){return juegos;}
}
