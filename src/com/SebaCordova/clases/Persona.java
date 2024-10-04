package com.SebaCordova.clases;

public class Persona {
	String nombre;
	int edad;
	
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public void despliegaInformacion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
}
