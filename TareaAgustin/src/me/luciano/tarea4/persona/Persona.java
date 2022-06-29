package me.luciano.tarea4.persona;

import java.util.LinkedList;

import me.luciano.tarea4.objetos.Libro;

public class Persona {
	private String nombre;
	private String direccion;
	private LinkedList<Libro> listaLibros;
	
	public Persona(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaLibros = new LinkedList<Libro>();
	}
	
	public String obtenerNombre() {
		return this.nombre;
	}
	
	public String obtenerDireccion() {
		return this.direccion;
	}
	
	public LinkedList<Libro> obtenerListaLibros() {
		return this.listaLibros;
	}
}