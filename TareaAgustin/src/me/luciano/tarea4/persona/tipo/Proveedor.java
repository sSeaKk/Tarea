package me.luciano.tarea4.persona.tipo;

import me.luciano.tarea4.persona.Persona;

public class Proveedor extends Persona{
	private String giroComercial;
	
	public Proveedor(String nombre, String direccion, String giroComercial) {
		super(nombre, direccion);
		this.giroComercial = giroComercial;
	}
	
	public String obtenerGiroComercial() {
		return this.giroComercial;
	}
}