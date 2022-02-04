package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizzeria")
public class Pizzeria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPizzeria;
	
	@Column
	private String direccion;
	
	@Column
	private String sede;

	public Integer getIdPizzeria() {
		return idPizzeria;
	}

	public void setIdPizzeria(Integer idPizzeria) {
		this.idPizzeria = idPizzeria;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}
}
