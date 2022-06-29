package me.luciano.tarea4.objetos;

import java.util.LinkedList;

import me.luciano.tarea4.persona.tipo.Autor;

public class Libro {
	private String titulo;
	private int anioPublicacion;
	private LinkedList<Autor> autores;
	private Indice indice;
	
	public Libro(String titulo, int anioPublicacion) {
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
		this.autores = new LinkedList<Autor>();
		this.indice = new Indice();
	}
	
	public void actualizarAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	public String obtenerTitulo() {
		return this.titulo;
	}
	
	public int obtenerAnioPublicacion() {
		return this.anioPublicacion;
	}
	
	public void agregarAutor(Autor autor) {
		autores.add(autor);
	}
	
	public void eliminarAutor(Autor autor) {
		autores.remove(autor);
	}
	
	public void eliminarAutor(String nombreAutor) {
		for(Autor autor : autores) {
			if(autor.obtenerNombre().equals(nombreAutor)) {
				autores.remove(autor);
			}
		}
	}
	
	public Indice getIndice() {
		return this.indice;
	}
}