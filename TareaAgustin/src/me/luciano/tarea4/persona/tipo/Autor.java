package me.luciano.tarea4.persona.tipo;

import java.util.LinkedList;

import me.luciano.tarea4.objetos.Libro;
import me.luciano.tarea4.persona.Persona;

public class Autor extends Persona{
	private String email;
	private LinkedList<String> titulos;
	
	public Autor(String nombre, String direccion, String email) {
		super(nombre, direccion);
		this.email = email;
		this.titulos = new LinkedList<String>();
	}
	
	public void actualizarEmail(String email) {
		this.email = email;
	}
	
	public void agregarLibros(Libro libro) {
		super.obtenerListaLibros().add(libro);
	}
	
	public String obtenerEmail() {
		return this.email;
	}
	
	public LinkedList<String> obtenerTitulos(){
		return this.titulos;
	}
	
	public void eliminaLibro(Libro libro) {
		super.obtenerListaLibros().remove(libro);
	}
	
	public void eliminaLibro(String nombreLibro) {
		for(Libro libro : super.obtenerListaLibros()) {
			if(libro.obtenerTitulo().equals(nombreLibro)) {
				super.obtenerListaLibros().remove(libro);
			}
		}
	}
}