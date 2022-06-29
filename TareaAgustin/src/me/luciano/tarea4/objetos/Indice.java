package me.luciano.tarea4.objetos;

import java.util.LinkedList;

public class Indice {
	private LinkedList<String> contenidos;
	
	public Indice() {
		this.contenidos = new LinkedList<String>();
	}
	
	public LinkedList<String> obtenerContenidos() {
		return contenidos;
	}
	
	public void agregar(String contenido) {
		this.contenidos.add(contenido);
	}
	
	public void eliminar(String contenido) {
		this.contenidos.remove(contenido);
	}
}