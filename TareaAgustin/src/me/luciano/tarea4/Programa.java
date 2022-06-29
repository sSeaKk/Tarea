package me.luciano.tarea4;

import me.luciano.tarea4.persona.tipo.Cliente;

public class Programa {
	private Cliente cliente;
	
	public Programa() {
		this.cliente = new Cliente("Pepe", "La Paz, Bolivia", "Ninguno", "Garzon");
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
}
