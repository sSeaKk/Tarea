package me.luciano.tarea4.persona.tipo;

import me.luciano.tarea4.persona.Persona;

public class Cliente extends Persona{
	private String antecendentes, giro;
	
	public Cliente(String nombre, String direccion, String antecedentes, String giro) {
		super(nombre, direccion);
		
		this.antecendentes = antecedentes;
		this.giro = giro;
	}
	
	public String obtenerAntecedentes() {
		return this.antecendentes;
	}
	
	public String obtenerGiro() {
		return this.giro;
	}
	
	public void modificarAntecedente(int antecedente) {
		this.antecendentes = String.valueOf(antecedente);
	}
	
	public void modificarGiro(String giro) {
		this.giro = giro;
	}
}